/*
 * Creado por SharpDevelop.
 * Usuario: Axel
 * Fecha: 08/08/2015
 * Hora: 07:24 p.m.
 * 
 * Para cambiar esta plantilla use Herramientas | Opciones | Codificación | Editar Encabezados Estándar
 */
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using System.Drawing.Imaging;
using System.IO;


namespace Paint
{
	/// <summary>
	/// Description of MainForm.
	/// </summary>
	public partial class MainForm : Form
	{
		Graphics g;
		
		Pen p = new Pen (Color.Black,1);
		Point sp=new Point (0,0);
		Point ep = new Point (0,0);
		int k = 0;
		int figura;
		private int cX , cY ,x , y , dX , dY;
		Color color;
		public MainForm()
		{
			//
			// The InitializeComponent() call is required for Windows Forms designer support.
			//
			InitializeComponent();
			
			//
			// TODO: Add constructor code after the InitializeComponent() call.
			//
			color = Color.Black;
		}
		void MainFormMouseUp(object sender, MouseEventArgs e)
		{
	
		}
		void NegroClick(object sender, EventArgs e)
		{
			color = Color.Black;
			Default1.BackColor = color;
		}
		void DarkGrayClick(object sender, EventArgs e)
		{
			color = Color.DarkGray;
			Default1.BackColor = color;
		}
		void BrownClick(object sender, EventArgs e)
		{
		     color = Color.Brown;
			Default1.BackColor = color;
			
		}
		void GrayClick(object sender, EventArgs e)
		{
	color = Color.Gray;
			Default1.BackColor = color;
		}
		void MaroonClick(object sender, EventArgs e)
		{
	color = Color.Maroon;
			Default1.BackColor = color;
		}
		void RedClick(object sender, EventArgs e)
		{
	color = Color.Red;
			Default1.BackColor = color;
		}
		void BlancoClick(object sender, EventArgs e)
		{
	color = Color.White;
			Default1.BackColor = color;
		}
		void PinkClick(object sender, EventArgs e)
		{
	color = Color.Pink;
			Default1.BackColor = color;
		}
		void YellowClick(object sender, EventArgs e)
		{
	color = Color.OrangeRed;
			Default1.BackColor = color;
		}
		void OrangeRedClick(object sender, EventArgs e)
		{
	color = Color.Yellow;
			Default1.BackColor = color;
		}
		void GoldClick(object sender, EventArgs e)
		{
	color = Color.Gold;
			Default1.BackColor = color;
		}
		void LightSalmonClick(object sender, EventArgs e)
		{
	color = Color.LightSalmon;
			Default1.BackColor = color;
		}
		void GreenClick(object sender, EventArgs e)
		{
	color = Color.Green;
			Default1.BackColor = color;
		}
		void YellowGreenClick(object sender, EventArgs e)
		{
	color = Color.YellowGreen;
			Default1.BackColor = color;
		}
		void SteelBlueClick(object sender, EventArgs e)
		{
	color = Color.SteelBlue;
			Default1.BackColor = color;
		}
		void AquaClick(object sender, EventArgs e)
		{
	color = Color.Aqua;
			Default1.BackColor = color;
		}
		void MediumSlateBlueClick(object sender, EventArgs e)
		{
	color = Color.MediumSlateBlue;
			Default1.BackColor = color;
		}
		void RoyalBlueClick(object sender, EventArgs e)
		{
	color = Color.RoyalBlue;
			Default1.BackColor = color;
		}
		void PurpleClick(object sender, EventArgs e)
		{
	color = Color.Purple;
			Default1.BackColor = color;
		}
		void BisqueClick(object sender, EventArgs e)
		{
	color = Color.Bisque;
			Default1.BackColor = color;
		}
		void PantallaMouseDown(object sender, MouseEventArgs e)
		{
			sp = e.Location;
			if(e.Button==MouseButtons.Left){
				k=1;
			}
			cX = e.X;
			cY = e.Y;
		}

		void PantallaMouseMove(object sender, MouseEventArgs e)
		{
			label1.Text = "X: " + Convert.ToString(x);
			label2.Text = "y: " + Convert.ToString(y);
			if (k == 1){
				ep = e.Location;
				x = e.X;
				y= e.Y;
			
				 if(figura==1){
				g.DrawLine(new Pen(color) ,sp , ep);
								}
				else if(figura == 2){
				g.FillEllipse(new SolidBrush(color), e.X,e.Y,60,60);
				}
				else if(figura == 6){
				g.FillEllipse(new SolidBrush(color), e.X,e.Y,60,60);
				}
				else if (figura == 7){
					g.FillEllipse(new SolidBrush(color) , e.X , e.Y , 5 ,5);
				}
					else if (figura == 8){
					g.FillEllipse(new SolidBrush(color) , e.X , e.Y , 15 ,15);
				}
					else if (figura == 9){
					g.FillEllipse(new SolidBrush(color) , e.X , e.Y , 25 ,25);
				}
					else if (figura == 10){
					g.FillEllipse(new SolidBrush(color) , e.X , e.Y , 35 ,35);
				}
			sp =ep;
		}
		}
		void PantallaMouseUp(object sender, MouseEventArgs e)
		{
			k=0;
		}
		void MainFormLoad(object sender, EventArgs e)
		{
			g = Pantalla.CreateGraphics();
		}
		void Button17Click(object sender, EventArgs e)
		{
	
		}
		void Default1Click(object sender, EventArgs e)
		{
	
		}
		void Button7Click(object sender, EventArgs e)
		{
			figura =1 ;
		}
		void Button8Click(object sender, EventArgs e)
		{
			figura = 2;
			color = Color . White;
		}
		void Button1Click(object sender, EventArgs e)
		{
			figura = 3 ;
		}
		void Button3Click(object sender, EventArgs e)
		{
			figura =4 ;
		}
		void Button2Click(object sender, EventArgs e)
		{
			figura = 5;
		}
		void PantallaMouseClick(object sender, MouseEventArgs e)
		{
			if (k ==1){
				x=e.X;
				y=e.Y;
				dX = e.X -cX;
				dY = e.Y -cY;
				if (figura == 3  ){
					g.DrawLine(new Pen (color) , cX , cY , e.X , e.Y);
				}
				if (figura ==4 ){
					g.DrawEllipse(new Pen (color) , cX , cY , dX , dY);
				}
				if (figura == 5){
					g.DrawRectangle(new Pen(color) , cX , cY , dX , dY);
				}
			}
		}
		void Button4Click(object sender, EventArgs e)
		{
			figura = 6;
		}
		void Label1Click(object sender, EventArgs e)
		{
	
		}
		void Button5Click(object sender, EventArgs e)
		{
				           Pantalla.Refresh();
	           Pantalla.Image = null;
		}
		void SaveFileDialog1FileOk(object sender, System.ComponentModel.CancelEventArgs e)
		{
	
		}
		void ComboBox1SelectedIndexChanged(object sender, EventArgs e)
		{
	
		}
		void GuardarClick(object sender, EventArgs e)
		{
			Bitmap bmp = new Bitmap(Pantalla.Width, Pantalla.Height);
            Graphics g = Graphics.FromImage(bmp);
            Rectangle rect = Pantalla.RectangleToScreen(Pantalla.ClientRectangle);
            g.CopyFromScreen(rect.Location, Point.Empty, Pantalla.Size);
            g.Dispose();
            SaveFileDialog s = new SaveFileDialog();
            s.Filter = "Png files|*.png|jpeg files|*jpg|bitmaps|*.bmp";
            if (s.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {
                if (File.Exists(s.FileName))
                {
                    File.Delete(s.FileName);
                }
                if (s.FileName.Contains(".jpg"))
                {
                    bmp.Save(s.FileName, ImageFormat.Jpeg);
                }
                else if (s.FileName.Contains(".png"))
                {
                    bmp.Save(s.FileName, ImageFormat.Png);
                }
                else if (s.FileName.Contains(".bmp"))
                {
                    bmp.Save(s.FileName, ImageFormat.Bmp);
                }
            }
		}
		void NuevoClick(object sender, EventArgs e)
		{
	           Pantalla.Refresh();
	           Pantalla.Image = null;
            
		}
		void AbrirClick(object sender, EventArgs e)
		{
	OpenFileDialog o = new OpenFileDialog();
            o.Filter = "Png files|*.png|jpeg files|*jpg|bitmaps|*.bmp";
            if (o.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {
                Pantalla.Image = (Image)Image.FromFile(o.FileName).Clone();
            }
		}
		void Button9Click(object sender, EventArgs e)
		{
			figura = 8;
		}
		void Button10Click(object sender, EventArgs e)
		{
			figura= 9;
		}
		void Button11Click(object sender, EventArgs e)
		{
			figura = 10;
		}
		void Button6Click(object sender, EventArgs e)
		{
			figura = 7 ;
		}
		

	}
}
