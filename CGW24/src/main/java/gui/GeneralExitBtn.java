//���������������� �����, ��������������� ��� ����������� ������� ������������ ����������
package gui;

//����������, ������� ������������� ���������� � ������ ��� ������
//� ���������� ������ �������, ����������� ������������
import java.awt.event.*;
//����������, ������� ������������� ���������� ������������ ����������
import javax.swing.*;

//��������� ����� GeneralExitBtn, ������� ����������� �� ������ JButton
//����� ������ ��� ����, ����� ������������ ������������� ������ �� ������ ������
public final class GeneralExitBtn extends JButton {
	
	//����������� ������
	public GeneralExitBtn() {
		
		//� ������� super() ��������� ������� ���������
		//������������� ������. ����� ������� ���������
		//��������� ������ JButton
		super();
		
		//��������� ������
		setText("�����");
		setSize(100, 30);
		setLocation(20, 210);
		
		//��������� ��������� ������
		addActionListener(new ActionListener() {
			//��������������� ������ ���������� ActionListener
			@Override
			public void actionPerformed(ActionEvent e) {
				//���������� ������ ���������
				System.exit(1);
			}
		});
	}
	
}