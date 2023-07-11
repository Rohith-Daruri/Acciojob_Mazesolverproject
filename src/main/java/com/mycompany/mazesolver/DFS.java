/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;

import java.util.ArrayList;

/**
 *
 * @author RD
 */
public class DFS {
    public static boolean visitpath(int mat[][],int x,int y,ArrayList<Integer> a){
        if(mat[y][x]==9){
            a.add(x);
            a.add(y);
            return true;
        }
        if(mat[y][x]==0){
            mat[y][x]=2;
            int dx=-1;
            int dy=0;
            if(visitpath(mat,dx+x,dy+y,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            dx=1;
            dy=0;
            if(visitpath(mat,dx+x,dy+y,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            dx=0;
            dy=-1;
            if(visitpath(mat,dx+x,dy+y,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            dx=0;
            dy=1;
            if(visitpath(mat,dx+x,dy+y,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            
        }
        return false;
    }
}
