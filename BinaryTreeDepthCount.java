static int maxDepth(Treenode node, int depth){
	if (node == null){
		return 0;
	}
	else if (node.left == null & node.right == null){
		return depth;
	}
	else {
		int Leftmax = maxDepth(node.left, depth+1)
		int Rightmax = maxDepth(node.right, depth+1)
		if (LeftMax > RightMax){
			return LeftMax
		}
		else {
			return RightMax
		}
	}
}

static int count(Treenode node){
	if(node == null){
		return 0
	}
	else if(node.left == 0 & node.right == 0){
		return 1;
	}
	else {
		return count(node.left)+count(node.right);
	}
}

public static void main(Strings[] args){
	root = null;

	for (int i = 0; i < 1020; i++){
		treeInsert(Math.random())
	}

	int leafcount = count(root);
	int depthMax = depthmath(root, 0);

	System.out.println("number of leaves " + leafcount);
}