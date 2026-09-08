/* কাজ: Swing লাইব্রেরি থেকে JButton (বাটন তৈরি করার জন্য) এবং JFrame (উইন্ডো তৈরি করার জন্য) উপাদানগুলো ইম্পোর্ট করছে। */
import javax.swing.JFrame;
import javax.swing.JButton;

public class CreateButton {
    public static void main(String[] args) {

        //frame নামে একটি নতুন উইন্ডো বা স্ক্রিন তৈরি করছে এবং তার শিরোনাম (Title) দিচ্ছে "Button Example"।
        JFrame jf = new JFrame("Button Example");

        //button নামে একটি নতুন বাটন তৈরি করছে, যার ওপর লেখা থাকবে "Click me"
        JButton jb = new JButton("Click me");


        /*  স্ক্রিনে বাটনের অবস্থান ও আকার নির্ধারণ করছে:
        প্রথম 50 (x): বাম পাশ থেকে ৫০ পিক্সেল ডানে।
        দ্বিতীয় 50 (y): ওপর থেকে ৫০ পিক্সেল নিচে।
        90 (width): বাটনের চওড়া বা প্রস্থ ৯০ পিক্সেল।
        30 (height): বাটনের উচ্চতা ৩০ পিক্সেল। */
        jb.setBounds(80, 50, 90, 50);

        //তৈরি করা button-টি মূল উইন্ডো বা frame-এর ভেতরে যুক্ত করছে।
        jf.add(jb);

        jf.setSize(300, 200);       //পুরো উইন্ডোর আকার নির্ধারণ করছে (প্রস্থ ৩০০ পিক্সেল এবং উচ্চতা ২০০ পিক্সেল)
        jf.setLayout(null);     //উইন্ডোর ডিফল্ট লেআউট ম্যানেজার বন্ধ করছে, যেন আমরা setBounds() ব্যবহার করে উপাদানের নিজস্ব সাইজ ও পজিশন ঠিক করতে পারি।
        jf.setVisible(true);    //উইন্ডোটিকে স্ক্রিনে দৃশ্যমান বা প্রকাশ্য করছে (এটি না দিলে উইন্ডোটি আড়ালেই থেকে যাবে)
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //উইন্ডোর লাল ক্রস (×) বাটনে ক্লিক করলে পুরো প্রোগ্রামটি সম্পূর্ণ বন্ধ হওয়ার নির্দেশ দিচ্ছে
    }

}
