package cn.stu.builder;

import javax.swing.JPanel;

/***
 * 4指挥者
 * 
 * @author liuhuan
 */

public class Director {
	private Builder builder;

	Director(Builder builder) {
		this.builder = builder;
	}

	public JPanel constructProduct() {
		builder.buildButton();
		builder.buildLabel();
		builder.buildTextField();
		JPanel product = builder.getPanel();
		return product;
	}
}
