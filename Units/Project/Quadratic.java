public class Quadratic extends Function
{
private JTextField aBox, hBox, kBox;
private double a, h, k;
private JPanel center;
private JLabel[][] output;
public Quadratic()
{
setLayout(new BorderLayout());

Panel north = new JPanel();
north.setLayout(new FlowLayout());
newTextField(north, " a = ", aBox);
newTextField(north, " h = ", hBox);
newTextField(north, " k = ", kBox);
add(north, BorderLayout.NORTH);

JPanel center = new JPanel();
center.setLayout(new GridLayout(4,2));
output = new JLabel[2][4];
for(int x=0; x<2; x++)
	for(int y=0; y<4; y++)
	{
		output[x][y] = new JLabel("-----");
		center.add(output[x][y]);
	}
add(output, BorderLayout.CENTER());
}


public void setVariables()
{
a = Double.parseDouble(aBox.getText());
h = Double.parseDouble(hBox.getText());
k = Double.parseDouble(kBox.getText());
}

public void displayEquation(JLabel label)
{
label.setText("y = a(x - h)^2 + k");
}
private void center()
{
output[0][0].setText("Center: (" + h + ", " + k")");
}
private void vertStretch()
{
String s;
if(Math.abs(a)>1)
s = "Stretch";
else
s = "Shrink";
output[0][1].setText("Vertical " + s + " by Factor of " + a);
}
private void focus()
{
output[0][2].setText("Focus: (" + h + ", " + (k+1/4a)")");
}



public void calculateAndOutput()
{
center();
vertStretch();
focus();
directrix();
lineOfSym();
factoredForm();
standardForm();
}