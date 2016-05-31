package com.example.test;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity{

	Button btn1, btn2;
    TextView textInfo;

    MyThread myThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        First frist=new First();
        
        getSupportFragmentManager().beginTransaction().add(R.id.content_main, frist).commit();
//        btn1 = (Button)findViewById(R.id.button1);
//        btn2 = (Button)findViewById(R.id.button2);
//        textInfo = (TextView)findViewById(R.id.info);
//
//        btn1.setOnClickListener(btnOnClickListener);
//        btn2.setOnClickListener(btnOnClickListener);
//
//        myThread = new MyThread(this);
//        myThread.start();
        
        
        
        
    }
    
//    public void SimpleTest(final int i){
//    	if(i==1){
////    		textInfo.setText("Message 1");
//    		
//    		runOnUiThread(new Runnable() {
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_LONG).show();
//				}
//			});
////    		
//    	}
//    	else{
//    		
//    		
//    		
//    		
////    		textInfo.setText("Message 2");
//    	}
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        //stop and quit the background Thread
//        myThread.handler.getLooper().quit();
//    }
//
//    View.OnClickListener btnOnClickListener =
//        new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                if(myThread.handler != null){
//                    Message message;
//                    if(v==btn1){
//                        message = myThread.handler.obtainMessage(MyThread.MSG1);
//                        System.out.println("message 1"+message);
//                    }else{
//                        message = myThread.handler.obtainMessage(MyThread.MSG2);
//                        System.out.println("message 2"+message);
//                    }
//                    myThread.handler.sendMessage(message);
//                }
//            }
//        };
//
//	@Override
//	public int iChwck() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public void Simpletest(final int iShort){
//		runOnUiThread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				textInfo.setText(""+iShort);
//			}
//		});
//	}

//    private class MyThread extends Thread{
//
//        static final int MSG1 = 1;
//        static final int MSG2 = 2;
//
//        public Handler handler;
//
//        public void run(){
//            Looper.prepare();
//            handler = new MyHandler();
//            Looper.loop();
//        }
//
//        private class MyHandler extends Handler{
//            @Override
//            public void handleMessage(Message msg) {
//                // ...Run in background
//
//                int what = msg.what;
//                switch (what){
//                    case MSG1:
//
//                        //doing something...
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                textInfo.setText("Message 1");
//                            }
//                        });
//
//                        break;
//                    case MSG2:
//
//                        //doing something...
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                textInfo.setText("Message 2");
//                            }
//                        });
//
//                        break;
//
//                }
//            }
//        }
//    }
}
