package com.diycomputerscience.programming;


/**
 * This class exposes the delegate class Square to it's client.
 * This is not a good idea and  is a candidate for applying the
 * hide delegate refactoring
 * 
 * @author pshah
 *
 */
public class Board {

	public static final int MAX_COLS = 6;
	public static final int MAX_ROWS = 6;
	
	private BoardState boardState;
		
	public Board() {		
		init();
	}

	
	public void init() {
		//initialize the board
	}
	
//	public Square getSquare(Point point) {
//		return this.boardState.getSquare(point);
//	}
	
	//all ops that can be done on this board
	
	public int fetchSquareCount(Point point) {
		return this.boardState.getSquare(point).getCount();
	}
	
	public boolean isSquareMine(Point point) {
		return this.boardState.getSquare(point).isMine();
	}
	
	public Square.STATUS fetchSquareStatus(Point point) {
		return this.boardState.getSquare(point).getStatus();
	}

	public void markSquareAsMine(Point point) {
		this.boardState.getSquare(point).markAsMine();		
	}

	public void uncoverSquare(Point point)  {
		this.boardState.getSquare(point).uncover();
	}
	
	//end ops
		
}
