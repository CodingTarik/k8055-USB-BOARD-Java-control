package tarik.board.control;

import com.sun.jna.ptr.IntByReference;

import com.sun.jna.*;
/**
 * Interface für das UsbBoard.
 * Um eine neue Instanz zu bekommen, führe die Methode USBBoard.getBoard() aus.
 * @author Tarik A.
 *
 */
public interface TWUsbBoard extends Library {		
	 int OpenDevice(int CardAddress); 
	 void CloseDevice();
	 int SearchDevices();
	 int SetCurrentDevice(int lngCardAddress); 
	 int Version(); 
	 int ReadAnalogChannel(int Channel); 
	 void ReadAllAnalog(IntByReference Data1, IntByReference Data2);
	 void OutputAnalogChannel(int Channel, int Data); 
	 void OutputAllAnalog(int Data1, int Data2); 
	 void ClearAnalogChannel(int Channel);
	 void ClearAllAnalog(); 
	 void SetAnalogChannel(int Channel); 
	 void SetAllAnalog(); 
	 void WriteAllDigital(int Data); 
	 void ClearDigitalChannel(int Channel);
	 void ClearAllDigital(); 
	 void SetDigitalChannel(int Channel);
	 void SetAllDigital();
	 boolean ReadDigitalChannel(int Channel);
	 int ReadAllDigital();
	 void ResetCounter(int CounterNr); 
	 int ReadCounter(int CounterNr); 
	 void SetCounterDebounceTime(int CounterNr, int DebounceTime);
	 int ReadBackDigitalOut(); 
	 void ReadBackAnalogOut(IntByReference Buffer); 
	 
	  // Field descriptor #6 Ljava/lang/String;
	  public static final java.lang.String VERSION_TWUSB = "1.0";
	  
	  // Field descriptor #6 Ljava/lang/String;
	  public static final java.lang.String TWUSB_DLL_NAME = "TWUsb";
	  
	  // Field descriptor #14 I
	  public static final int ADDRESSE_0 = 0;
	  
	  // Field descriptor #14 I
	  public static final int ADDRESSE_1 = 1;
	  
	  // Field descriptor #14 I
	  public static final int ADDRESSE_2 = 2;
	  
	  // Field descriptor #14 I
	  public static final int ADDRESSE_3 = 3;
	  
	  // Field descriptor #14 I
	  public static final int ADDRESSE_AUTO_SEARCH = 99;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_1 = 1;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_2 = 2;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_3 = 3;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_4 = 4;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_5 = 5;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_6 = 6;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_7 = 7;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_AUSGABE_KANAL_8 = 8;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_EINGABE_KANAL_1 = 1;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_EINGABE_KANAL_2 = 2;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_EINGABE_KANAL_3 = 3;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_EINGABE_KANAL_4 = 4;
	  
	  // Field descriptor #14 I
	  public static final int DIGITALER_EINGABE_KANAL_5 = 5;
	  
	  // Field descriptor #43 Z
	  public static final boolean DIGITALER_EINGABE_KANAL_AN = true;
	  
	  // Field descriptor #43 Z
	  public static final boolean DIGITALER_EINGABE_KANAL_AUS = false;
	  
	  // Field descriptor #43 Z
	  public static final boolean DIGITALER_EINGABE_KANAL_TASTE_GEDRUECKT = true;
	  
	  // Field descriptor #43 Z
	  public static final boolean DIGITALER_EINGABE_KANAL_TASTE_NICHT_GEDRUECKT = false;
	  
	  // Field descriptor #14 I
	  public static final int ANALOGER_EINGABE_KANAL_1 = 1;
	  
	  // Field descriptor #14 I
	  public static final int ANALOGER_EINGABE_KANAL_2 = 2;
	  
	  // Field descriptor #14 I
	  public static final int ANALOGER_AUSGABE_KANAL_1 = 1;
	  
	  // Field descriptor #14 I
	  public static final int ANALOGER_AUSGABE_KANAL_2 = 2;
	  
	  // Field descriptor #14 I
	  public static final int COUNTER_KANAL_1 = 1;
	  
	  // Field descriptor #14 I
	  public static final int COUNTER_KANAL_2 = 2;
	  
	  // Field descriptor #14 I
	  public static final int MAX_DATA = 255;
	  
	  // Field descriptor #14 I
	  public static final int MIN_DATA = 0;
	  
	  // Field descriptor #14 I
	  public static final int MAX_ENTPRELL_ZEIT = 5000;
	  
	  // Field descriptor #14 I
	  public static final int MIN_ENTPRELL_ZEIT = 0;
	  
	  // Field descriptor #43 Z
	  public static final boolean DEVICE_IS_CONNECT = true;
	  
	  // Field descriptor #43 Z
	  public static final boolean DEVICE_NOT_CONNECT = false;
	  
	  // Field descriptor #14 I
	  public static final int DEVICE_NOT_FOUND = -1;
	  
	  // Field descriptor #14 I
	  public static final int DATA_FEHLER = -1;
	  
	  // Field descriptor #65 J
	  public static final long ABFRAGE_INTERVAL_100_MILLISEKUNDEN = 100L;
	  
	  // Field descriptor #65 J
	  public static final long ABFRAGE_INTERVAL_500_MILLISEKUNDEN = 500L;
	  
	  // Field descriptor #65 J
	  public static final long ABFRAGE_INTERVAL_1_SEKUNDEN = 1000L;
	  
	  // Field descriptor #65 J
	  public static final long ABFRAGE_INTERVAL_5_SEKUNDEN = 5000L;
	  
	  // Field descriptor #65 J
	  public static final long ABFRAGE_INTERVAL_10_SEKUNDEN = 10000L;
	  
	  // Field descriptor #65 J
	  public static final long START_IN_1_SEKUNDE = 1000L;
	  
	  // Field descriptor #65 J
	  public static final long START_IN_10_SEKUNDEN = 10000L;
	  
	  // Field descriptor #65 J
	  public static final long START_IN_1_MINUTE = 60000L;
	  
	  // Field descriptor #65 J
	  public static final long START_IN_10_MINUTEN = 600000L;
}
