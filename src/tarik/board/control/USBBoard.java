package tarik.board.control;

import com.sun.jna.Native;

/**
 * Factory for USBoard
 * @author Tarik
 *
 */
public class USBBoard
{
	 private static TWUsbBoard usbBoard;

	 /**
	  * @author Tarik A.
	  * @return a instance to control the USB Board
	 * 	@throws TWUsbException 
	  */
	 public static TWUsbBoard getBoard() throws TWUsbException
	 {		
		 if(usbBoard == null)
		 {
			 usbBoard = (TWUsbBoard) Native.load("lib\\K8055D.dll", TWUsbBoard.class);
			 if(usbBoard == null)
			 {
				 throw new TWUsbException();
			 }		
		 }
		 return usbBoard;
	 }	
}
