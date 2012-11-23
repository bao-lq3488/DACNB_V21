import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class MainForm {
	public Display display;
	public Shell shell;

	public void runShell() {
		display = new Display();
		shell = new Shell(display);
		GridLayout grid = new GridLayout(2, false);
		shell.setLayout(grid);
		
		final Label label = new Label(shell, SWT.RIGHT);
		label.setText("aa");
		Label label2 = new Label(shell, SWT.NONE);
		label2.setText("bb");
		Label label3 = new Label(shell, SWT.BORDER);
		label3.setText("cc");
		
		Button btt = new Button(shell, SWT.PUSH);
		btt.setText("chuyen form");
		btt.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label.setText("alo1234");
				label.setSize(20, 30);
			}
			
			@Override
			public void mouseDown(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()){
				display.sleep();
			}
		}
	}
	public void Close(){
		this.display.close();
	}
}
