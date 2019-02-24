/*
 * Developed by Sijar Ahmed on 12/2/19 3:17 PM
 * Last modified 12/2/19 3:17 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface CallbackExample is responsible for...
 * @author sijarahmed
 * 12/2/19 3:17 PM
 *
 */
public class CallbackExample {

    interface OnGeekEventListener {
        void onGeekEvent();
    }

//    class A implements OnGeekEventListener {
//        @Override
//        public void onGeekEvent()
//        {
//            System.out.println("Performing callback after synchronous Task");
//        }
//    }
//
//    class B {
//        private OnGeekEventListener mListener; // listener field
//        public void registerOnGeekEventListener(OnGeekEventListener mListener)
//        {
//            this.mListener = mListener;
//        }
//
//        public void doGeekStuff()
//        {
//            System.out.println("Performing callback before synchronous Task");
//            if (this.mListener != null) {
//                mListener.onGeekEvent();
//            }
//        }
//        public static void main(String[] args)
//        {
//            B obj = new B();
//            OnGeekEventListener mListener = new A();
//            obj.registerOnGeekEventListener(mListener);
//            obj.doGeekStuff();
//        }
//    }


}
