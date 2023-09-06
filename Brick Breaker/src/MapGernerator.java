import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
public class MapGernerator {
 public int map[][];
 public int brick_Width;
 public int brick_Height;
 public MapGernerator(int row,int col)
 {
     map= new int[row][col];
     for(int []map1:map)
     {
         for(int j=0;j<map[0].length;j++)
         {
             map1[j]=1;
         }
     }
     brick_Width = 540/col;
     brick_Height = 150/row;
     
 }
 
 public void draw(Graphics2D g)
 {
     for(int i=0;i<map.length;i++){
         for(int j=0;j<map.length;j++)
         {
             if(map[i][j]>0)
             {
                 g.setColor(Color.blue);
                 g.fillRect(j*brick_Width+80,i*brick_Height+50,brick_Width,brick_Height);
                 g.setStroke(new BasicStroke(3));
                 g.setColor(Color.black);
                 g.drawRect(j*brick_Width+80,i*brick_Height+50,brick_Width,brick_Height);
                 
                                 
             }
         }
     }
 }
     public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }
}
     

     
   


