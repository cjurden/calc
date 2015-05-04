import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
	private View v;
	private Model m;
	
	public Controller(View v, Model m){
		this.v = v;
		this.m = m;
		
		this.v.addcalclistener(new addlistener());
		this.v.subcalclistener(new sublistener());
		this.v.multcalclistener(new multlistener());
		this.v.divcalclistener(new divlistener());
		
	}
	
	class addlistener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int first, second = 0;
			
			try{
				first = v.getfirst();
				second = v.getsecond();
				m.add(first, second);
				v.setsol(m.getval());
			}catch(NumberFormatException ex){
				v.disperror("correct your input");
			}
		}
		
	}
	
	class sublistener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int first, second = 0;
			
			try{
				first = v.getfirst();
				second = v.getsecond();
				m.sub(first, second);
				v.setsol(m.getval());
			}catch(NumberFormatException ex){
				v.disperror("correct your input");
			}
		}
		
	}
	
	class multlistener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int first, second = 0;
			try{
				first = v.getfirst();
				second = v.getsecond();
				m.mult(first, second);
				v.setsol(m.getval());
			}catch(NumberFormatException ex){
				v.disperror("correct your input");
			}
		}
		
	}
	
	class divlistener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int first, second = 0;
			try{
				first = v.getfirst();
				second = v.getsecond();
				m.div(first, second);
				v.setsol(m.getval());
			}catch(NumberFormatException ex){
				v.disperror("correct your input");
			}
		}
		
	}
}
