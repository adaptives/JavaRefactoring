package com.diycomputerscience.programming;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * In this class the push and pop mehtods both write audit log,
 * however they have duplicate code which can be refactored into
 * a separate method
 * @author pshah
 *
 */
public class AuditedStack {
	
	private int contents[];
	private int pos = 0;
	
	private String logFileName;
	
	public AuditedStack(String logFileName) {
		this.logFileName = logFileName;
		this.contents = new int[100];
	}
	
	public void push(int i) {
		PrintWriter writer = null;
		try { 
			writer = new PrintWriter(new FileWriter(this.logFileName));
			writer.println(new Date() + " pushing " + i);
		} catch(IOException ioe) {
			System.out.println("Could not write audit log " + ioe);
		} finally {
			writer.close();
		}
		
		this.contents[pos] = i;
		this.pos++;
	}
	
	public int pop() {
		int i = this.contents[this.pos--];
		
		PrintWriter writer = null;
		try { 
			writer = new PrintWriter(new FileWriter(this.logFileName));
			writer.println(new Date() + " popping " + i);
		} catch(IOException ioe) {
			System.out.println("Could not write audit log " + ioe);
		} finally {
			writer.close();
		}
		
		return i;
	}
	
}
