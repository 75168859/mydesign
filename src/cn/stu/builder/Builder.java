package cn.stu.builder;

import javax.swing.JPanel;

/**
 * 2抽象生成器
 * @author liuhuan
 *
 */

public interface Builder {
	public abstract void buildButton();

	public abstract void buildLabel();

	public abstract void buildTextField();

	public abstract JPanel getPanel();
}
