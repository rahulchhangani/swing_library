package com.gg.tablerownumbers;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class TableRowNumberTester extends JFrame {

	public static void main(String[] args) {

		TableRowNumberTester t = new TableRowNumberTester();

		t.setSize(500, 600);
		t.add(t.getPanel());
		t.setVisible(true);

	}

	public static JPanel getPanel() {

		JPanel panel = new JPanel();

		final TableRowNumberTester t = new TableRowNumberTester();

		ArrayList<TestObject> al = new ArrayList<TestObject>();
		
		
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		al.add(t.new TestObject("the", new Date(), new Integer(1), "A"));
		al.add(t.new TestObject("quick", new Date(), new Integer(2), "B"));
		al.add(t.new TestObject("brown", new Date(), new Integer(3), "C"));
		al.add(t.new TestObject("fox ", new Date(), new Integer(4), "D"));
		al.add(t.new TestObject("jumps", new Date(), new Integer(5), "E"));
		al.add(t.new TestObject("over", new Date(), new Integer(6), "F"));
		al.add(t.new TestObject("the", new Date(), new Integer(7), "G"));
		al.add(t.new TestObject("lazy", new Date(), new Integer(8), "H"));
		al.add(t.new TestObject("fox", new Date(), new Integer(9), "I"));
		

		TestModel model2 = t.new TestModel(al);

		final JTable userTable = new JTable(model2);

		TestRenderer renderer1 = t.new TestRenderer();
		for (int i = 0; i < userTable.getColumnCount(); i++) {
			userTable.getColumnModel().getColumn(i).setCellRenderer(renderer1);
		}
		userTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		// userTable.setColumnSelectionAllowed(true);
		userTable.setRowSelectionAllowed(true);
		// userTable.setCellSelectionEnabled(true);

		final JScrollPane pane = new JScrollPane(userTable);
		TableUtilities.addNumberColumn(userTable, 1, true);

		panel.add(pane);

		return panel;

	}

	public class TestModel extends AbstractTableModel {
		private ArrayList list = new ArrayList();
		protected String[] columnNames = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		public TestModel(ArrayList list) {
			this.list = list;
		}

		public void removeRows(int[] rowsSelected) {
			ArrayList collectionToDelete = new ArrayList();
			for (int i = 0; i < rowsSelected.length; i++) {
				Object o = list.get(rowsSelected[i]);
				collectionToDelete.add(o);
			}

			list.removeAll(collectionToDelete);
		}

		public void addRow(TestObject object) {
			list.add(object);
		}

		public int getRowCount() {
			return list.size();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public String getColumnName(int i) {
			return columnNames[i];
		}

		public Object getValueAt(int rowIndex, int columnIndex) {
			Object value = null;
			TestObject to = (TestObject) list.get(rowIndex);

			switch (columnIndex) {
			case 0:
				value = to.one;
				break;
			case 1:
				value = to.two;
				break;
			case 2:
				value = to.three;
				break;
			case 3:
				value = to.four;
				break;
			case 4:
				value = to.five;
				break;
			case 5:
				value = to.six;
				break;
			}
			
			
			
			return value;
		}

		public TestObject getTestObject(int row) {
			return (TestObject) list.get(row);
		}
	};

	class TestRenderer extends DefaultTableCellRenderer {

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			JLabel component = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

			TableColumn tc = table.getColumnModel().getColumn(column);

			int i = table.getColumnModel().getColumnIndex(tc.getIdentifier());

			Object o = table.getModel().getValueAt(row, i);

			if (isSelected) {
				component.setBackground(Color.BLACK);
				component.setForeground(Color.WHITE);
			} else {
				if (o instanceof Date) {
					component.setBackground(Color.GREEN.brighter().brighter().brighter().brighter());
					component.setForeground(Color.BLACK);
				}
				else if (o instanceof Integer) {
					component.setBackground(Color.ORANGE.brighter().brighter());
					component.setForeground(Color.BLACK);
				} else {
					component.setBackground(Color.WHITE);
					component.setForeground(Color.BLACK);
				}
			}
			return component;
		}
	}

	class TestObject {
		public String one;
		public Date two;
		public Integer three;
		public String four;
		public String five;
		public String six;

		public TestObject(String s, Date d, Integer i, String s2) {
			one = s;
			two = d;
			three = i;
			four = s2;
			five = s;
			six = s;
		}
	}
}