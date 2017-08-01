// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * className: DrawDomain<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DrawDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -963811320539766293L;
	
	
	// gamcode
	private String gameCode;
	private String gameDraw;
	private Date saleBegin;
	private Date saleEnd;
	private Date payBegin;
	private Date payEnd;
	private String lotteryNo;
	private String drawType;
	
	
	/**
	 * @return the gameCode
	 */
	public String getGameCode() {
		return gameCode;
	}
	/**
	 * @param gameCode the gameCode to set
	 */
	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	/**
	 * @return the gameDraw
	 */
	public String getGameDraw() {
		return gameDraw;
	}
	/**
	 * @param gameDraw the gameDraw to set
	 */
	public void setGameDraw(String gameDraw) {
		this.gameDraw = gameDraw;
	}
	/**
	 * @return the saleBegin
	 */
	public Date getSaleBegin() {
		return saleBegin;
	}
	/**
	 * @param saleBegin the saleBegin to set
	 */
	public void setSaleBegin(Date saleBegin) {
		this.saleBegin = saleBegin;
	}
	/**
	 * @return the saleEnd
	 */
	public Date getSaleEnd() {
		return saleEnd;
	}
	/**
	 * @param saleEnd the saleEnd to set
	 */
	public void setSaleEnd(Date saleEnd) {
		this.saleEnd = saleEnd;
	}
	/**
	 * @return the payBegin
	 */
	public Date getPayBegin() {
		return payBegin;
	}
	/**
	 * @param payBegin the payBegin to set
	 */
	public void setPayBegin(Date payBegin) {
		this.payBegin = payBegin;
	}
	/**
	 * @return the payEnd
	 */
	public Date getPayEnd() {
		return payEnd;
	}
	/**
	 * @param payEnd the payEnd to set
	 */
	public void setPayEnd(Date payEnd) {
		this.payEnd = payEnd;
	}
	/**
	 * @return the lotteryNo
	 */
	public String getLotteryNo() {
		return lotteryNo;
	}
	/**
	 * @param lotteryNo the lotteryNo to set
	 */
	public void setLotteryNo(String lotteryNo) {
		this.lotteryNo = lotteryNo;
	}
	/**
	 * @return the drawType
	 */
	public String getDrawType() {
		return drawType;
	}
	/**
	 * @param drawType the drawType to set
	 */
	public void setDrawType(String drawType) {
		this.drawType = drawType;
	}
}
