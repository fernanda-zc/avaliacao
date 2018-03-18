package br.com.avaliacao.tree;

public class BinaryTree {
	public int valor;
	public BinaryTree left;
	public BinaryTree right;

	public int soma(BinaryTree node)
	{
		if((node.right == null)||(node.left == null))
		{
			if(node.right != null)
				return node.right.valor + soma(node.right);
			else if(node.left != null)
				return node.left.valor + soma(node.left);
			//se node.right e node.left forem nulos, retorna 0
			else
				return 0;
		}
		else
			return node.right.valor + node.left.valor + soma (node.right) + soma(node.left);
	}
}
