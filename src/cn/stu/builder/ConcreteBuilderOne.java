package cn.stu.builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 3具体生成器
 * @author liuhuan
 *
 */
public class ConcreteBuilderOne implements Builder {
	private PanelProduct panel;

	ConcreteBuilderOne() {
		panel = new PanelProduct();
	}

	public void buildButton() {
		panel.button = new JButton("按钮");
	}

	public void buildLabel() {
		panel.label = new JLabel("标签");
	}

	public void buildTextField() {

	}

	public JPanel getPanel() {
		panel.add(panel.button);
		panel.add(panel.label);
		return panel;
	}
}