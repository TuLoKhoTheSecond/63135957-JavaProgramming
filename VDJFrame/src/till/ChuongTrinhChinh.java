package till;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ChuongTrinhChinh {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Vi du JFrame");  
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); 
		

		f.setLayout(new FlowLayout());
		

		JButton btnOK = new JButton("Nhấn tôi đi");
		

		btnOK.addActionListener (new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog();
				dialog.setTitle("Thông báo gì đó");
				dialog.setSize(220,120);
				dialog.show();
			}
		});
		
		JButton btnOK2 = new JButton("Nhấn mình đi");

		f.add(btnOK);
		
		f.add(btnOK2);
		f.show(); 
	}
//	//Tạo bộ lắng nghe (hữu danh) và xử lý cho nút OK
//	private static class BoLangNgheOK implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			//Mã xử lý khi user click ở đây
//			JDialog dialog = new JDialog();
//			dialog.setTitle("Thông báo gì đó");
//			dialog.setSize(220,120);
//			dialog.show();
//		}
//	}
}