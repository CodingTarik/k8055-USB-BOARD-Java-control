package Board;

import tarik.board.control.*;
public class Zaehler {
	 
    public static void main(String[] args) {
        System.out.println("Programm gestartet, warten auf Tastendruck");
        try {
        	// Einziger Unterschied zum normalen Code
        	TWUsbBoard TWUsb = USBBoard.getBoard();
        	
            TWUsb.OpenDevice(TWUsbBoard.ADDRESSE_0);
            TWUsb.ClearAllDigital();
            Thread.sleep(100);
            TWUsb.ClearAllAnalog();
            Thread.sleep(100);           
            // *****************************************************************
            // hier kommt dann später euer eigener Code hinein  
            for (int i = 0; i < 256; i++) {
                while ((TWUsb.ReadAllDigital() & 0b10000) == 0){ // Flanke                     
                    Thread.sleep(1);                
                }
                System.out.println("ein Tastendruck");
                TWUsb.WriteAllDigital(i);
                Thread.sleep(100);
            }
            // *****************************************************************            
            TWUsb.CloseDevice();                    
        } catch (TWUsbException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
    }
}

