package com.example.test;

import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class First extends Fragment implements iTestNew,Communicator{

	View convertView;
	Button btn1,btn2;
	TextView textInfo;
	 MyThread  myThread;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {


		
		convertView = inflater.inflate(R.layout.activity_main, container,
				false);
		
		
	

	   btn1 = (Button)convertView.findViewById(R.id.button1);
       btn2 = (Button)convertView.findViewById(R.id.button2);
       textInfo = (TextView)convertView.findViewById(R.id.info);

       btn1.setOnClickListener(btnOnClickListener);
       btn2.setOnClickListener(btnOnClickListener);

         myThread = new MyThread(this);
       myThread.start();
       
       
       return convertView;
   }
   
   public void SimpleTest(final int i){
   	if(i==1){
//   		textInfo.setText("Message 1");
   		
   		getActivity().runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Toast.makeText(getActivity(), ""+i, Toast.LENGTH_LONG).show();
					textInfo.setText("Message 1");
				}
			});
//   		
   	}
   	else{
   		
   		
   		getActivity().runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), ""+i, Toast.LENGTH_LONG).show();
				textInfo.setText("Message 12");
			}
		});
   	
   		
//   		textInfo.setText("Message 2");
   	}
   }

//   @Override
//   protected void onDestroy() {
//       super.onDestroy();
//
//       //stop and quit the background Thread
//       myThread.handler.getLooper().quit();
//   }
   public void onDestroyView() {
	   super.onDestroy();
	   myThread.handler.getLooper().quit();
   };

   View.OnClickListener btnOnClickListener =
       new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               if(myThread.handler != null){
                   Message message;
                   if(v==btn1){
                       message = myThread.handler.obtainMessage(MyThread.MSG1);
                       System.out.println("message 1"+message);
                   }else{
                       message = myThread.handler.obtainMessage(MyThread.MSG2);
                       System.out.println("message 2"+message);
                   }
                   myThread.handler.sendMessage(message);
               }
           }
       };

	@Override
	public int iChwck() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
