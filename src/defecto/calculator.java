package defecto;
public class calculator{
    public static void main(String args[]){
        Ventana calculadora =  new Ventana();

        int var1 = calculadora.getVariable1();
        int var2 = calculadora.getVariable2();
        
        

<<<<<<< Updated upstream
=======
public class calculator extends JFrame implements ActionListener {
    
  private JButton btnsuma,btnresta,btnmulti,btndiv,btnlimpiar,btnmod,btnsalir;
 private JTextField valor1,valor2,camporesultado;
 JLabel label1,label2,label3;
  
 public void Controles(){
   
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout());
   label1 = new JLabel("Numero 1");
      contenedor.add(label1);
      valor1 = new JTextField(10);
      contenedor.add(valor1);
     label2 = new JLabel("Numero 2");
      contenedor.add(label2);
      valor2 = new JTextField(10);
      contenedor.add(valor2);
      btnsuma = new JButton("+");
      contenedor.add(btnsuma);
      btnsuma.addActionListener(this);
      btnresta = new JButton("-");
      contenedor.add(btnresta);
      btnresta.addActionListener(this);
      btnmulti = new JButton("x");
      contenedor.add(btnmulti);
      btnmulti.addActionListener(this);
      btndiv = new JButton("/");
      btndiv.addActionListener(this);
      contenedor.add(btndiv);
      btnmod=new JButton("mod");
      btnmod.addActionListener(this);
      contenedor.add(btnmod);
      camporesultado = new JTextField(10);
      contenedor.add(camporesultado);
      btnlimpiar = new JButton("Limpiar");
      contenedor.add(btnlimpiar);
      btnlimpiar.addActionListener(this);
      btnsalir=new JButton("Salir");
      btnsalir.setBackground(Color.red);
      contenedor.add(btnsalir);
      btnsalir.addActionListener(this);
 }
  
 public calculator(){
      super("Calculadora");
      Controles();
      setSize(380,200);
      setLocationRelativeTo(null);
      setVisible(true);
 }
  
 public void actionPerformed(ActionEvent e) {
     double  num1,num2,resu;
     String resultado;
        if (e.getSource()==btnsuma) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.WARNING_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1+num2;
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        } 

        if (e.getSource() == btnmulti) {
			if (valor1.getText().equals("") || valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Los datos no están completos", "Error",
						JOptionPane.WARNING_MESSAGE);
			} else {
				num1 = Double.parseDouble(valor1.getText());
				num2 = Double.parseDouble(valor2.getText());
				resu = num1 * num2;
				resultado = String.valueOf(resu);
				camporesultado.setText(resultado);
			}
		}

        if (e.getSource() == btnresta) {
			if (valor1.getText().equals("") || valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Los datos no están completos", "Error",
						JOptionPane.WARNING_MESSAGE);
			} else {
				num1 = Double.parseDouble(valor1.getText());
				num2 = Double.parseDouble(valor2.getText());
				resu = num1 - num2;
				resultado = String.valueOf(resu);
				camporesultado.setText(resultado);
			}
		}


        if (e.getSource() == btndiv) {
			if (valor1.getText().equals("") || valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Los datos no están completos", "Error",
						JOptionPane.WARNING_MESSAGE);
			} else if (valor2.getText().equals("0")) {

                resultado = "indefinido";
                camporesultado.setText(resultado);
            }

                else {
				num1 = Double.parseDouble(valor1.getText());
				num2 = Double.parseDouble(valor2.getText());
				resu = num1 / num2;
				resultado = String.valueOf(resu);
				camporesultado.setText(resultado);
                }
		}

        if (e.getSource() == btnmod) {
			if (valor1.getText().equals("") || valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Los datos no están completos", "Error",
						JOptionPane.WARNING_MESSAGE);
			} else {
				num1 = Double.parseDouble(valor1.getText());
				num2 = Double.parseDouble(valor2.getText());
				resu = num1 % num2;
				resultado = String.valueOf(resu);
				camporesultado.setText(resultado);
			}
		}


        if (e.getSource()==btnlimpiar){
         valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
       }
       
       
        if(e.getSource()==btnsalir)
        {
         System.exit(0);   
        }
>>>>>>> Stashed changes
    }
}