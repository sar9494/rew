package lab2;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Comparator;



	public class GenericListUI<T extends Number & Comparable<T>> extends JFrame {
	    private List<T> myList = new ArrayList<>();

	    public GenericListUI() {
	        setTitle("Generic List");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JButton addButton = new JButton("Элемэнт нэмэх");
	        JButton displayButton = new JButton("Элемэнт хэвлэх");
	        JButton removeButton = new JButton("Элемэнт хасах");
	        JButton sortButton = new JButton("Элемэнт эрэмблэх");
	        JButton checkEmptyButton = new JButton("Хоосон эсэхийг шалгах");
	        JButton sumButton = new JButton("Бүх элемэнтийн нийлбэр");

	        addButton.addActionListener(new ActionListener() {
	        
	            public void actionPerformed(ActionEvent e) {
	                addElement();
	            }
	        });

	        displayButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                displayElements();
	            }
	        });

	        removeButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                removeElement();
	            }
	        });

	        sortButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                sortElements();
	            }
	        });

	        checkEmptyButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                checkEmpty();
	            }
	        });

	        sumButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getSum();
	            }
	        });

	        setLayout(new GridLayout(3, 2));
	        add(addButton);
	        add(displayButton);
	        add(removeButton);
	        add(sortButton);
	        add(checkEmptyButton);
	        add(sumButton);
	    }

	    private void addElement() {
	        String input = JOptionPane.showInputDialog(this, "Нэмэх элемент:");
	        try {
	            T element = (T) Double.valueOf(input);  
	            myList.add(element);
	            JOptionPane.showMessageDialog(this, "Элемэнт нэмэгдлээ.");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Буруу оролт. Тоон утга оруулна уу.");
	        }
	    }

	    private void displayElements() {
	        JOptionPane.showMessageDialog(this, "Жагсаалтад байгаа элементүүд: " + myList);
	    }

	    private void removeElement() {
	        String input = JOptionPane.showInputDialog(this, "Хасах элэмэнт:");
	        try {
	            T element = (T) Double.valueOf(input); 	          
	            if (myList.contains(element)) {
	                myList.remove(element);
	                JOptionPane.showMessageDialog(this, "Элемэнт хасагдлаа.");
	            } else {
	                JOptionPane.showMessageDialog(this, "Элемэнт олдмонгүй");
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Буруу оролт. Тоон утга оруулна уу.");
	        }
	    }

	    	private void sortElements() {
	    	    Collections.sort(myList, new Comparator<T>() {
	    	  
	    	        
	    	        public int compare(T o1, T o2) {
	    	            return o1.compareTo(o2);
	    	        }
	    	    });
	    	    JOptionPane.showMessageDialog(this, "Эрэмблэгдсэн элемэнт " + myList);
	    	}
	        
	    private void checkEmpty() {
	        if (myList.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Жагсаалт хоосон байна.");
	        } else {
	            JOptionPane.showMessageDialog(this, "Жагсаалт хоосон биш байна. Элементүүд: " + myList);
	        }
	    }

	    private void getSum() {
	        if (myList.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Жагсаалт хоосон байна. Sum: 0");
	        } else {
	            double sum = 0;
	            for (T element : myList) {
	                sum += element.doubleValue();
	            }
	            JOptionPane.showMessageDialog(this, "Элемэнтүүдийн нийлбэр " + sum);
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            
	            public void run() {
	                new GenericListUI<Integer>().setVisible(true);
	            }
	        });
	    }
	}


