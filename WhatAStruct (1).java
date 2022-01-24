class Node
{
	// Add your code here
	public int id;
	public int priority;
	public Node(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}

}

class WhatAStruct
{

	public Node[] hashtable;
	private Node noitem;
	private int hashSize;

	public WhatAStruct(int mx) {

		hashSize = 2*mx;
		hashtable = new Node[hashSize];
		noitem = new Node(-1, 0); //For deleted items


	}

	private boolean isPrime(int n) {
		for (int j=2 ; (j*j <= n) ; j++)
			if (n % j == 0)
				return false;
		return true;
	}

	public int hashFunc2(int id) {

		return 3 -id % 3;
	}

	public int hashFunc(int id) {

		return id % hashSize;
	}
	
	public boolean insert(Node n) {

		int id = n.id;
		int hash = hashFunc(id); // Hashing the id of the item

		while(hashtable[hash] != null && hashtable[hash].id != -1){ // Finding empty space in the array
			hash++;
			hash = hash % hashSize;
		}
		hashtable[hash] = n; // Inserting the node

		return false;
	} 
	
	public Node remove() {

		int maxPriority = 0;
		int maxId =0;
		boolean pass = false;

		for (int i = 0; i < hashSize; i++) {
			if (hashtable[i] != null && hashtable[i].id != -1) // Finding the first node and setting it as max
				maxId = hashtable[i].id;
			maxPriority = hashtable[i].priority;
			pass = true;
			break;
		}

		if (pass == true) { //If there is a initial node

			int hash = hashFunc(maxId);

			while(hashtable[hash] != null){
				if (hashtable[hash].id == maxId){
					Node temp = hashtable[hash];
					hashtable[hash] = noitem; //Deleting the max item
					return temp; // returning the max after checking the whole array
				}
				hash++;
				hash = hash % hashSize;
			}

		}
		return null;
	}

	
	public boolean contains(int id) {

		int hash = hashFunc(id);

		while(hashtable[hash] != null){
			if (hashtable[hash].id == id)
				return true;
			hash++;
			hash = hash % hashSize;
		}

		return false;
	}
	
	public WhatAStruct union(WhatAStruct w) {

		WhatAStruct newhashtable = new WhatAStruct((w.hashSize+hashSize)/2);// Making the new Hash Table
		int hash;
		int step;

		for (int i=0; i< hashSize; i++){
			for (int j=0; j< w.hashSize; j++){
				if((hashtable[i] != null && hashtable[i].id != -1) && (w.hashtable[j] != null && w.hashtable[j].id != -1)){
					if (hashtable[i].id == w.hashtable[j].id){
						hash = hashtable[i].id % newhashtable.hashSize;
						step = hashFunc2(hashtable[i].id);
						while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){// Inserting the hashtable item in the new Hash Table
							hash+= step;
							hash %= newhashtable.hashSize;
							System.out.println("ok1");
						}
						newhashtable.hashtable[hash] = hashtable[i];
						newhashtable.hashtable[hash].priority = hashtable[i].priority + w.hashtable[j].priority;

					}else{
						step = hashFunc2(hashtable[i].id);
						hash = hashtable[i].id % newhashtable.hashSize;
						while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){// Inserting the hashtable item in the new Hash Table
							hash+= step;
							hash %= newhashtable.hashSize;
							System.out.println("ok2");
						}
						newhashtable.hashtable[hash] = hashtable[i];

						hash+= step;
						hash %= newhashtable.hashSize;
						while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){// Inserting the hashtable item in the new Hash Table
							hash+= step;
							hash %= newhashtable.hashSize;
							System.out.println("ok3");
						}
						newhashtable.hashtable[hash] = w.hashtable[j];
					}
				}
			}
		}
		return newhashtable;

	}	

	public WhatAStruct diff(WhatAStruct w) {


		WhatAStruct newhashtable = new WhatAStruct(2*(w.hashSize+hashSize));
		int hash=0;

		for (int i=0; i< hashSize; i++){
			if(hashtable[i] != null && hashtable[i].id != -1)
				hash = hashFunc(hashtable[i].id);;
		}

		for (int i=0; i< hashSize; i++){
			for (int j=0; j< w.hashSize; j++){
				if((hashtable[i] != null && hashtable[i].id != -1) && (w.hashtable[j] != null && w.hashtable[j].id != -1)){
					if (hashtable[i].id != w.hashtable[j].id){//Checking if there are different or same
						while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){// Inserting the hashtable item in the new Hash Table
							hash++;
							hash = hash % hashSize;
							System.out.println("ok4");
						}
						newhashtable.hashtable[hash] = hashtable[i];
					}else if( hashtable[i].id == w.hashtable[j].id ){
						while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){// Inserting the hashtable item in the new Hash Table
							hash++;
							hash = hash % hashSize;
							System.out.println("ok5");
						}
						newhashtable.hashtable[hash] = hashtable[i];
						newhashtable.hashtable[hash].priority = hashtable[i].priority - w.hashtable[j].priority;
					}
				}
			}
		}
		return newhashtable;

	}

	public WhatAStruct kbest(int k) {

		WhatAStruct newhashtable = new WhatAStruct(hashSize);

		if (hashSize < k ){// If K is greater than the hastable size just inserting the whole hastable to newhashtable
			int hash=0;

			for (int i=0; i< hashSize; i++){
				if(hashtable[i] != null && hashtable[i].id != -1)
					hash = hashFunc(hashtable[i].id);;
			}
			for (int i=0; i< k; i++){
				while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){
					hash++;
					hash = hash % hashSize;
				}
				newhashtable.hashtable[hash] = hashtable[hash];
			}
			return newhashtable;
		}
		else {

			Node temptable[] = new Node[hashSize]; //Making a temp table to sort it
		//	temptable.hashtable = hashtable;
			int count=0;

			for (int i=0; i< hashSize; i++){
				if(hashtable[i] != null && hashtable[i].id != -1){
					temptable[count]=hashtable[i];
					count++;
				}
			}

			for(int i=0; i< count-1; i++){//Sorting the table
				for (int j = 0; j < count-1-i; j++)
					if (temptable[j].priority < temptable[j + 1].priority) {
						Node temp = temptable[j];
						temptable[j] = temptable[j + 1];
						temptable[j + 1] = temp;
					}
			}

			for (int i=0; i< k; i++){
				int hash= hashFunc(temptable[0].id);

				while(newhashtable.hashtable[hash] != null && newhashtable.hashtable[hash].id != -1){// Inserting the Temp hashtable item in the new Hash Table
					hash++;
					hash = hash % hashSize;
				}
				newhashtable.hashtable[hash] = temptable[i];
			}

			return newhashtable;

		}

	}	
}

class Main {
	public static void main(String[] args) {
		WhatAStruct test = new WhatAStruct(100);
		try {
			System.out.print("\nTesting: insert()");
			for (int i = 0; i < 100; i++)
				if (test.insert(new Node(99-i,i))) exit(new Exception("insert() did not insert an item,\nthat should have been inserted\n" +i));
		} catch (Exception e) {exit(e);}
		try {
			System.out.print("\t\t\t\t\tCheck\n\nTesting: remove() & contains()");
			if (test.contains(test.remove().id)) exit(new Exception("remove() does not remove the Node intended or\ncontains() has a Node identification problem"));
		} catch (Exception e) {exit(e);}
		try {
			System.out.print("\t\tCheck\n\nTesting: kbest() ");
			if (test.kbest(10) == test.kbest(101)) exit(new Exception("kbest() has problem with the length and/or\nthe contents of the returned WhatAStruct(x)"));
		} catch (Exception e) {exit(e);}
		try {
			System.out.print("\t\t\t\t\tCheck\n\nTesting: union() & diff() ");
			if (test.union(test) == test || test.diff(test) == test) exit(new Exception("union() has a fatal problem and/or\ndiff() has a fatal problem"));
		} catch (Exception e) {exit(e);}
		for (int x: new int[]{9,9,9,67,104,101,99,107,10,10,10,78,105,99,101,33})
			System.out.print((char)x);
	}
	private static void exit(Exception e) {System.out.print("\t\tError\n\n\n" +e.getMessage()); System.exit(1);}
}

//class Main {
//
//	public static void main(String[] args) {
//
//		boolean ans;
//		int i,size,maxSize=4;
//		size=maxSize*2;
//
//		System.out.println("KSEKINISE I ASKISI");
//
//		WhatAStruct mystruct = new WhatAStruct(maxSize);
//
//		Node n1 = new Node(16,7374);
//		Node n2 = new Node(18,76);
//		Node n3 = new Node(17,1);
//		Node n4 = new Node(25,84);
//		Node del ;
//
//		mystruct.insert(n1);
//		mystruct.insert(n2);
//		mystruct.insert(n3);
//		mystruct.insert(n4);
//
//		ans=mystruct.contains(635);
//
//		if(ans==true) {
//			System.out.println("yparxei to id");
//		}else {
//			System.out.println("den yparxei to id");
//		}
//
//		del=mystruct.remove();
//
//		System.out.println("DIAGRAFTIKE KOMVOS ME ID"+del.id+"  KAI PRIORITY "+del.priority);
//
//		System.out.println("\n\n\n");
//		for(i=0;i<size;i++) {
//
//			if(mystruct.hashtable[i]==null) {
//				System.out.println("KOMVOS No"+i+"  einai kenos");
//			}else {
//				System.out.println("KOMVOS No"+i+"  ME ID"+mystruct.hashtable[i].id +"  KAI PRIORITY "+mystruct.hashtable[i].priority);
//			}
//
//
//		}
//
//	}
//
//}
