public class BinarySearchTree {

	// 트리를 구성할 노드
	static class Node {
		private int value;
		private Node leftNode;
		private Node rightNode;

		/* getter */
		public int getValue() {
			return value;
		}

		public Node getLeftNode() {
			return leftNode;
		}

		public Node getRightNode() {
			return rightNode;
		}

		/* setter */
		public void setValue(int value) {
			this.value = value;
		}

		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}

		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
	}

	// 트리는 각 노드를 이진트리형태로 저장하는 형태
	static class Tree {
		private Node rootNode;

		// rootNode가 없다면 rootNode로 추가해주고
		// rootNode가 있다면 value값과 rootNode의 value값을 비교하도록 함
		public void addNode(int value) {
			if (rootNode == null) {
				Node node = new Node();
				node.setValue(value);
				rootNode = node;
			} else {
				addNode(value, rootNode);
			}
		}

		// value값과 rootNode의 value값을 비교해서 value값이 작거나 같으면 leftNode로 추가해주고 value값이 크면 rightNode로 추가해줌
		// 다만 leftNode 또는 rightNode가 이미 존재할 시에 leftNode 또는 rightNode를 rootNode로 설정해서 재귀호출함
		public void addNode(int value, Node rootNode) {
			if (value <= rootNode.getValue()) {
				if (rootNode.getLeftNode() == null) {
					Node leftNode = new Node();
					leftNode.setValue(value);
					rootNode.setLeftNode(leftNode);
				} else {
					addNode(value, rootNode.getLeftNode());
				}
			} else {
				if (rootNode.getRightNode() == null) {
					Node rightNode = new Node();
					rightNode.setValue(value);
					rootNode.setRightNode(rightNode);
				} else {
					addNode(value, rootNode.getRightNode());
				}
			}
		}

		// 전위순회
		public void preOrder(Node rootNode) {
			if (rootNode == null)
				return;
			System.out.print(rootNode.getValue() + " ");
			preOrder(rootNode.getLeftNode());
			preOrder(rootNode.getRightNode());
		}

		// 중위순회
		public void inOrder(Node rootNode) {
			if (rootNode == null)
				return;
			inOrder(rootNode.getLeftNode());
			System.out.print(rootNode.getValue() + " ");
			inOrder(rootNode.getRightNode());
		}

		// 후위순회
		public void postOrder(Node rootNode) {
			if (rootNode == null)
				return;
			postOrder(rootNode.getLeftNode());
			postOrder(rootNode.getRightNode());
			System.out.print(rootNode.getValue() + " ");
		}
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.addNode(13);
		tree.addNode(23);
		tree.addNode(15);
		tree.addNode(38);
		tree.addNode(3);
		tree.addNode(6);
		tree.addNode(1);

		System.out.print("전위순회 결과 : ");
		tree.preOrder(tree.rootNode);
		System.out.println();
		
		System.out.print("중위순회 결과 : ");
		tree.inOrder(tree.rootNode);
		System.out.println();
		
		System.out.print("후위순회 결과 : ");
		tree.postOrder(tree.rootNode);
		System.out.println();
	}
}
