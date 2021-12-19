class Arc {
	public int from;
	public int to;
	public int weight;

	public Arc(int from, int to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}

	public Arc copy() {
		return new Arc(this.from, this.to, this.weight);
	}
}

class Node {
	// Add your code here
	public Arc arc;
	public Node next;

	public Node(Arc arc) {
		this.arc = arc;
	}

}

class ArcList {

	private Node first;
	private Node currentarc;

	public ArcList() {
		// Your code here
		first = null;
	}

	public int size() {
		// your code here
		Node temp = first;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
		//return 0;
	}

	public int insert(Arc arc) {
		// your code here
		if(arc != null){
			Arc newArc = arc.copy();
			Node newNode = new Node(newArc);
			newNode.next = first;
			first = newNode;
			return size();
		}

		return 0;
	}

	public Arc removeFirst() {
		// your code here
		if(first != null){
			Node current = first;
			first = first.next;
			return first.arc;
		}
		return null;
	}

	public Arc remove(int from, int to) {
		// your code here
		if(first != null){
			Node current  = first;
			Node previous  = first;
			while (current != null){
				if (current.arc.from == from && current.arc.to == to){
					if(current == first) first = first.next;
					else previous.next = current.next;
					return current.arc;
				}
				current = current.next;
			}
		}
		return null;
	}

	public Arc arc(int from, int to) {
		// your code here
		Node current  = first;
		while (current != null){
			if (current.arc.from == from && current.arc.to == to) return current.arc;
			current = current.next;
		}

		return null;
	}

	public ArcList arcWeightsIn(int lb, int ub) {
		// your code here
		Node current  = first;
		currentarc  = first;
		ArcList arclistweight = new ArcList();
		while (current != null) {
			if (current.arc.weight >= lb && current.arc.weight <= ub) {
				current.arc = arclistweight.currentarc.arc;
				current = current.next;
				currentarc = arclistweight.currentarc.next;
			}
			else current = current.next;
		}
		return arclistweight;
	}

	public ArcList heaviestArcs(int k) {
		// your code here
		Node current  = first;
		currentarc  = first;
		int tmpk = 0;
		ArcList arclistheavy = new ArcList();
		while ((current != null) && (tmpk <= k )) {
			if(current.arc.weight >= current.next.arc.weight){
				arclistheavy.currentarc.arc = current.arc.copy();
				tmpk ++;
			}else current = current.next;
		}

		return arclistheavy;
	}

	public ArcList leastInfluence(int sum) {
		// your code here

		return null;
	}

	public ArcList topInfluencers(int k) {
		// your code here
		Node current  = first;
		Node previous  = first;
		currentarc  = first;
		int tmpk = 0;
		ArcList arclisttop = new ArcList();
		while ((current != null) && tmpk <= k ) {
			if(current.arc.weight >= current.next.arc.weight){
				arclisttop.currentarc.arc = current.arc.copy();
				tmpk ++;
				if(current == first) first = first.next;
				else previous.next = current.next;
			}else current = current.next;
		}

		return arclisttop;
	}
}
