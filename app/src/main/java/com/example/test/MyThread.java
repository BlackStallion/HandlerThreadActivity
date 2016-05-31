package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;

public class MyThread extends Thread {
  static final int MSG1 = 1;
  static final int MSG2 = 2;
  int i=0;
 
//  MainActivity activity;
//  Context ctxt;
  Communicator comm;
  Fragment ctxt;
  public MyThread(Fragment ctxt){
	comm=(Communicator) ctxt;
	this.ctxt=ctxt;
  }

  public Handler handler;

  public void run(){
      Looper.prepare();
      handler = new MyHandler();
//      activity=new MainActivity();
      Looper.loop();
  }

  private class MyHandler extends Handler implements iTestNew{
	  
      @Override
      public void handleMessage(Message msg) {
          // ...Run in background

          int what = msg.what;
          switch (what){
              case MSG1:

                  //doing something...
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

//                  ctxt.runOnUiThread(new Runnable() {
//                      @Override
//                      public void run() {
//                    	  activity.SimpleTest(MSG1);
//                      }
//                  });
                  
                  comm.SimpleTest(MSG1);
                  
                  

                  break;
              case MSG2:

                  //doing something...
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  
                  comm.SimpleTest(MSG2);
//                  runOnUiThread(new Runnable() {
//                      @Override
//                      public void run() {
//                          textInfo.setText("Message 2");
//                      }
//                  });
//              
//                  activity.runOnUiThread(new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						activity.SimpleTest(MSG2);
//					}
//				});
                  break;

          }
      }

	@Override
	public int iChwck() {
		// TODO Auto-generated method stub
		return i;
	}
  }
}