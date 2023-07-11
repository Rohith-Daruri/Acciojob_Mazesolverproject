/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author RD
 */
public class mazeclass extends JFrame {
    private int mat[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,1,1,1,1,1,0,0,0,0,0,1},
        {1,0,0,1,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    public ArrayList<Integer> a = new ArrayList<>();
    public mazeclass(){
        setTitle("MAZE SOLVER");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DFS.visitpath(mat,1,1,a);
        
    }
    @Override
    public void paint(Graphics g){
        g.translate(100,50);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                Color color;
                switch(mat[i][j]){
                case 1:color = Color.BLACK;break;
                case 9:color = Color.RED;break;
                default:color = Color.WHITE;break;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30,30);
                g.setColor(Color.RED);
                g.drawRect(30*j,30*i,30,30);
            }
        }
        for(int i=0;i<a.size();i+=2){
          int pathx =a.get(i);
          int pathy =a.get(i+1);
          g.setColor(Color.GREEN);
          g.fillRect(30*pathx, 30*pathy,30,30 );
        }
    }
    public static void main(String[] args){
        mazeclass obj = new mazeclass();
        obj.setVisible(true);
    }
    
    
}
