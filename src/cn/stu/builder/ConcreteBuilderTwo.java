package cn.stu.builder;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/***
 * 3 具体生成器
 * 
 * @author liuhuan
 *
 */
public class ConcreteBuilderTwo implements Builder {
	private PanelProduct panel;

	ConcreteBuilderTwo() {
		panel = new PanelProduct();
	}

	public void buildButton() {
		panel.button = new JButton("button");
	}

	public void buildLabel() {

	}

	public void buildTextField() {
		panel.textField = new JTextField("textField");
	}

	public JPanel getPanel() {
		panel.add(panel.textField);
		panel.add(panel.button);
		return panel;
	}
}