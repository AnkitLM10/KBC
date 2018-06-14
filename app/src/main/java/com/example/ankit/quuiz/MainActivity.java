package com.example.ankit.quuiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

/*    String ques[][] = {{"Which of these sounds would you associate with the heart ?",
            "With Which of these states do Chhattisgarh, Jharkhand and Andhra Pradesh all share their borders",
            "To respect whose word did the five Pandavas marry Draupadi? ",
            "Which is the largest banana producing country in the world?",
            "In 2013, India's Pinki Sonkar flipped the coin for the toss for which of these events? ",
            "To what post was P Sathasivam appointed in July 2013? ",
            "Which of these creatures does not have both the male and female reproductive organs in the same body (Hermaphrodites)? ",
            "Which of these cricketers is credited with the invention of the doosra? ",
            "Boal, Tengra and Magur are all species of which marine creature? ",
            "What is the most abundant mineral in the human body? "},
            {"Who is the 'Bharat Ka Veer Putra Aaccording to the title of a 2013 TV Series ? ",
                    "The first world championship in what sport is planned to be held in 2017, though the game has been played since 1877?",
                    "Which of these is the title of a fantasy novel by Devkinandan Khatri? ",
                    "Who is the first woman amputee in the world to summit Mount Everest ? ",
                    "Which gas is the most reactive of all chemical elements? ",
                    "Which sportsman's 108th birth anniversary was celebrated on 29 Aug 2013 ? ",
                    "Which of these usually eaten hot? ",
                    "What type of naval vehicle is the INS Sindhurakshak? ",
                    "Metal tools and machines are worshipped during which of these festivals?",
                    "Major Dhaynchand Played which Sport? "
            },
            {
                    "In 2013, where did the natural calamity known as Himalayan tsunami occur? ",
                    "Which is the largest living species of tortoise in the world, which may weigh about 400 kg? ",
                    "Under a campaign run by UNICEF and Government of India, Aamir Khan has been promoting awareness against which of these ? ",
                    "The tomb of which Governor-General of India is located in Ghazipur in Uttar Pradesh?",
                    "Which of these is a song picturised on Sharmila Tagore from the film 'Amar Prem'?",
                    "Mamnoon Hussain, recently elected president of pakistan, was born in which Indian city? ",
                    "According to the popular song by Shreya Ghosal , who arrives to light 'beedi and chillam' with her 'husn ki teeli'? ",
                    "Which place of worship is located between the Nar and Narayan mountains? ",
                    "Which of these is used as the universal symbol for the fight against HIV/AIDS? ",
                    "Who was bestowed with the 'Rani Laxmibai Stree Shakti Award' by President Mukherjee on International Women's Day in 2013? "
            },
            {
                    "Which film is this song from 'TERA RASTA MAI CHODU NA' ? ",
                    "According to legend, which of these Rishis regained his youth by a celestial favor ? ",
                    "Who is the only Indian to have won a medal in Women's Singles at the World Badminton Championships ?",
                    "Put these surnames in the order in which they appear in English telephone Directory A:NEHRU B:BOSE C:PATEL D:GANDHI",
                    "In the human body, what makes the pupil of an eye contract or dilate? ",
                    "What was the code name of the operation by IPKF to take control of Jaffna from the LTTE in 1987 ?",
                    "Which of these is not a type of vitamin? ",
                    "In which city was Vasco Da Gama first buried? ",
                    "Which of these is a popular game? ",
                    "Who among these women has been elected as a Member of Parliament on different occasions on congress and BJP tickets? "
            },
            {
                    "In the Ramayana, Which demon impersonated Rama's voice, screaming, 'Lakshman! Help me'? ",
                    "On a restaurant menu, which of these items is often listed as 'Jeera', 'Curd', 'Boiled' or 'Fried'?",
                    "Who has been the longest serving chief minister of Rajasthan?",
                    "Arrange these thing from north to south according to the places mentioned in their names A;Jaipuri Razai B:Mysore PaK C:Amritsari Kulcha D:Kashmiri Embroidery",
                    "NR Narayana Murthy was appointed Executive chairman of IT Giant in 2013? ",
                    "Which of these cities is not named after its founder or a dynasty? ",
                    "The newborn of which of these mammals weighs the heaviest? ",
                    "Starting from the front of a motor car, arrange these parts in correct order A:Steering Wheel B:Backseat C:Headlights D:Dashboard",
                    "'Mona Darling', played by Bindu and Mahie Gill in films , was an associate of which villain? ",
                    "Which is the coldest place in India? "
            },
            {
                    "Who is the only leader to be elected Prime Minister of Pakistan three times ? ",
                    "Which of these is a term for a place where people gather for shayari and ghazals ? ",
                    "From which country did India buy an aircraft carrier which was renamed as INS Vikramaditya? ",
                    "Select Countries with Biggest Area in Descending order A:Canada B:China C:USA D:Russia ",
                    "What is the name of India's first ever indigenous aircraft carrier launched in August 2013? ",
                    "Who is the youngest person ever to win a Nobel Prize ? ",
                    "Which of these parties broke away from the NDA in June 2013, after a 17-year long alliance? ",
                    "Select most Populus Country In Order A:China B:USA C:India D:Indonesia",
                    "Which of these is a type of Visa that allows free movement across most European countries? ",
                    "According to a Hindi Song, which of these is yamla Pagla Deewana? "
            },
            {
                    "The black widow, which eats the male counterpart after mating, as a female species of which animal ? ",
                    "Which of these is not a recommended mineral in the human diet ? ",
                    "Which of these freedom fighters was the English language secretary to Mahatma Gandhi for 16 years? ",
                    "Which of these is a piece of the game called as chess: ",
                    "BP Mandal, who chaired the second backward classes commission, also known as Mandal commission, served as chief minister of which state? ",
                    "Whom did Lalu Prasad Yadav replace as the Chief Minister of Bihar in 1990? ",
                    "Which one of these states is the largest in area? ",
                    "Arrange these states in the increasing order of members they send to the Lok Sabha A:UP D:Maharashtra C:Sikkim D:Uttarakhand",
                    "Reita Faria, Diana Hayden and Yukta Mookhey have all won which of these titles? ",
                    " With respect to jobs, what does 'padonnati' denote? "
            },
            {
                    "Douglas Engelbert, who passed away in 2013, is credited as the inventor of which of these products ? ",
                    "Who or what is the 'baby' in this recent newspaper headline: 'At 66, Mother India gets ready for her 29th baby'? ",
                    "Which of these dishes are usually 'tari ya ras waali' and 'sukhi' ? ",
                    "In the Ramayana, who reminded kaikeyi about the two boons given to her by Dasharatha ?",
                    "Who is the author of the poem 'Where the mind is without fear'? ",
                    " According to Abhigyana Shakuntlam, as result of which Rishi's curse did king Dushyant forget Shakuntla? ",
                    "Which of these sportsmen has not yet won the Rajiv Gandhi Khel Ratna Award? ",
                    "In the title of a 2013 Hindi film, which of these characters is told to run? ",
                    "Which football club won the English Premier League in 2012 after a gap of 44 years? ",
                    "Who is the director of National Film Award winning films 'Chokher bali' in Bengali, 'Raincoat' in Hindi and ' The Last Lear' in English? "
            },
            {
                    "In 1850, the first experimental electric telegraph line in India was set up between Calcutta and which place ? ",
                    "Who was the president of India at the turn of the century, as the 20th century became the 21st century ?",
                    "The end of what service is referred to in this newspaper headline : 'Dot, dash, full stop : ______________ service ends July 15 ' ? ",
                    " Which of these words means 'water'? ",
                    "To reach which of these places do pilgrims start their journey on foot from Gauri Kund? ",
                    " Who is the first batsman to score a century in all these formats of international cricket-Test, ODI and T20. ",
                    "Which poem are these lines from: 'Nari tum keval Shraddha ho, Vishwas-rajat-nag- pagtal mein, Piyush-srot-si baha karo, Jivan ke sunder samtal hein'? ",
                    "Which of these Indian cricketers are brothers? ",
                    "Which of these garments if named an atoll in the Marshall islands? ",
                    "According to the Ramayana, Whom did Raja Bhagirath request to reduce the flow of Ganga when she arrives on earth? "
            },
            {
                    "Which of these persons has not walked on the Moon ? ",
                    "The 2013 film 'Lootera' is partly based on which short story by O'Henry ? ",
                    "Which of these festivals is also known as 'Khichdi Parv' in northern India? ",
                    "What Social Compaign was launched by Farhan Akhtar in 2013 against rape and discrimination of women? ",
                    "Which of these sportsmen started his carrier as a travelling ticket examiner with Indian railways? ",
                    "Which of these is is a kind of a mobile phone?",
                    "Which is the only country, apart from India, where one can find the Indian rhinoceros in its natural Habitat? ",
                    "What is the name of the dancing form of Lord Shiva that gained prominence in India during the Chola period? ",
                    "Mother of the late Mansoor Ali Khan Pataudi was the Begum of which princely state of India? ",
                    "Which of these films was inspired by the fake CBI raids in the 1980s?"
            },
            {
                    "Who was the chairman of the Indian Calendar Reform Committee that initiated the adoption of Saka calendar as the Indian national Calendar ? ",
                    "Which flower goes before 'Gang' to make the title of Madhuri-Juhi film ?",
                    "To which of these Sufi saints is this song dedicated. OH Laal Pat meri ab ",
                    "In the Mughal era, which of these harbours was also known as 'Babul Mecca' and 'Meccaidwar'? ",
                    "Where was Durga Shakti Nagpal, IAS, serving when she was suspended by the UP Govt? ",
                    "A Batsman is most likely to be called 'out of form' because of which of the following?",
                    "In the movie, 'Athithi tum kab jaoge', who played the role of a guest. ",
                    "Complete this popular saying 'Daane Daane par likha hai _________'? ",
                    "In which district of Chhattisgarh did Maoists attack a convoy of Congress leaders on 25 May 2013? ",
                    "What surname do the businessmen Ghanshyam Das, Krishna Kumari Basant Kumar, Aditya Vikram and Kumar Mangalam share? "
            },
            {
                    "'The Phrase 100 crore Club', often mentioned in Indian media nowadays, refers to which one of the following ? ",
                    "In boxing, what are jab,cross and hook types of ?",
                    "In Which of these regions would you find the town of Kishtwar ? ",
                    "After whom is the annual award, given by the Govt of India to an outstanding handloom weaver, named ?",
                    "Which of these cricket tournaments is often referred to as the 'Mini World Cup' ? ",
                    "The increased level of which of these causes more humidity in the air? ",
                    "From top to bottom arrange these according to the parts of the body on which they are generally worn. A) Ghagra, B) Ghunghat C) Ghungroo, D) Ghadi. ",
                    "In geometry, if a shape has only three sides namely A, B and C, then what shape would that be? ",
                    "Which vitamin helps with blood clotting? ",
                    "According to Guinness World Records, what is the largest Carnivore on land? "
            }
    };
    String ans[][][] = {
            {{"Tring Tring", "Tap Tap", "Click Click", "Dhak Dhak", "4"},
                    {"Madhya Pradesh", "Odisha", "Bihar", "Uttar Pradesh", "2"},
                    {"Krishna", "Indra", "Kunti", "Madri", "3"},
                    {"Brazil", "India", "Mexico", "China", "2"},
                    {"Wimbledon Final", "Ashes test", "Australian Ladies final", "Champions Trophy Final","1"},
                    {"CBI Director", "Chief Justice of India", "Chief Election Commissioner", "National Security Advisor", "2"},
                    {"Earthworm", "Snail", "Black Sea Bass", "Termite", "4"},
                    {"Harbhajan Singh", "Muttiah Muralitharan", "Saqlain Mushtaq", "Anil Kumble", "3"},
                    {"Prawns", "Fish", "Crabs", "Turtles", "2"},
                    {"Iron", "Calcium", "Zinc", "Sodium", "2"}},
            {
                    {"Tipu Sultan", "Chandragupta Maurya", "Maharana Pratap", "Ashoka", "3"},
                    {"Test Cricket", "Rugby Union", "Kabaddi", "Carrom", "1"},
                    {"Chandraprabha", "Chandragupta", "Chandrakanta", "Chandraabha", "3"},
                    {"Tashi Malik", "Raha Moharrak", "Samina Baig", "Arunima Sinha", "4"},
                    {"Oxygen", "Chlorine", "fluorine", "hydrogen", "3"},
                    {"Dhyan Chand", "Ranjitsinhji", "C K Nayudu", "I A K Pataudi", "1"},
                    {"Rasgulla", "Pakoda", "Laddu", "Faluda", "2"},
                    {"Destroyer", "Submarine", "Aircraft Carrier", "Patrol Vehicle", "2"},
                    {"Baisakhi", "Dhanteras", "Vishvakarma Puja", "Saraswati Puja", "3"},
                    {"Hockey", "Football", "Volleyball", "Basketball", "1"}
            },
            {
                    {"Uttrakhand", "Arunachal Pradesh", "Jammu and Kashmir", "Sikkim", "1"},
                    {"Sulcata Tortoise", "Grenada Tortoise", "Golden Greek Tortoise", "Galapagos Tortoise", "4"},
                    {"Polio", "HIV/AIDS", "Family Planning", "Malnutrition", "4"},
                    {"Sir John Shore", "Lord Curzon", "Lord Cornwallis", "Lord Chelmsford", "3"},
                    {"Raina Beeti Jaye", "Kohli Na Aye", "Yuvi sateiyein", "Gambhir rulaye", "1"},
                    {"Allahabad", "Agra", "Ajmer", "Amritsar", "2"},
                    {"Sharmilli Sheila", "Mazedaar Munni", "Meethi Jalebi", "Chikni Chameli", "4"},
                    {"Kedarnath", "Badrinath", "Amarnath Cave", "Vaishno Devi", "2"},
                    {"Blue Circle", "Red Ribbon", "Pink Balloon", "White Bird", "2"},
                    {"Spirit of Nirbhaya", "Courage of Malala Yousafzai", "Women of India", "Victims of acid attack", "1"}
            },
            {
                    {"Mere Dad Ki Maruti", "Chennai Express", "Ghanchakkar", "Race 2", "2"},
                    {"Agastya", "Durvasa", "Chyavana", "Charaka", "3"},
                    {"Jwala Gupta", "P V Sindhu", "Saina Nehwal", "Ashwini Ponnappa", "2"},
                    {"DBCA", "BDAC", "CBDA", "ABCD", "2"},
                    {"Hunger", "Thirst", "Light", "Sound", "3"},
                    {"Operation Cyclone", "Operation Meghdoot", "Operation Cactus", "Operation Pawan", "4"},
                    {"Vitamin A", "Vitamin X", "Vitamin D", "Vitamin E", "2"},
                    {"Calicut", "Diu", "Vasco Da Gama", "Cochin", "4"},
                    {"Twitter", "Angry Birds", "Whatsapp", "Instagram", "2"},
                    {"Hema Malini", "Maneka Gandhi", "Yashodhara Raje Scindia", "Najma Heptullah", "4"}
            },
            {
                    {"Surpanakha", "Khara", "Maricha", "Dushana", "3"},
                    {"Manchurian", "Burger", "Rice", "Pasta", "3"},
                    {"Mohan Lal Sukhadia", "Bhairon Singh Shekhawat", "Ashok Gehlot", "Vasundhara Raje Sindia", "1"},
                    {"DACB", "ABCD", "DCAB", "BCDA", "3"},
                    {"Infosys", "TCS", "WIPRO", "HCL", "1"},
                    {"Bikaner", "Ludhiana", "Khajuraho", "Jodhpur", "3"},
                    {"Blue Whale", "African Elephant", "Hippopotamus", "Giant Panda", "1"},
                    {"CDBA", "DBCA", "CBDA", "ABCD", "1"},
                    {"Teja", "Mogambo", "Gabbar", "Shakaal", "1"},
                    {"Yusmarg", "Kulgam", "Drass", "Leh", "3"}
            },
            {
                    {"Syed Yousaf Raza Gillani", "Benazir Bhutto", "Liaqat Ali Khan", "Nawaz Sharif", "4"},
                    {"Rukhsar", "Mushaira", "Shikara", "Mahabara", "2"},
                    {"France", "Russia", "England", "Germany", "2"},
                    {"CDBA", "ABCD", "DCBA", "DABC", "4"},
                    {"INS Viraat", "INS Shaurya", "INS chakra", "INS Vikrant", "4"},
                    {" Malala", " Sir William Lawrence Bragg ", "Werner Heisenberg", "Paul A.M. Dirac", "1"},
                    {"Janata Dal (S)", "Telugu Desam Party", "Janata Dal (United)", "Biju Janata Dal", "3"},
                    {"ACBD", "ABDC", "ACDB", "BDCA", "1"},
                    {"Geneva", "Schengen", "Prague", "Maastricht", "2"},
                    {"Chhora", "Jatt", "Munda", "Puttar", "2"}
            },
            {
                    {"Sloth", "Ant", "Spider", "Termite", "3"},
                    {"Strontium", "Potassium", "Iron", "Calcium", "1"},
                    {"Hansa Mehta", "Rajkumari Amrit Kaur", "Sarojini Naidu", "Sushila Nayyar", "2"},
                    {"Wazir", "Nawab", "Sarpanch", "Patbari", "1"},
                    {"Uttar Pradesh", "Bihar", "West Bengal", "Odisha", "2"},
                    {"Bhagwan Jha Azad", "Jaganth Mishra", "Sateyndra nath Sinha", "Bindheswar Dubey", "2"},
                    {"Assam", "Arunachal Pradesh", "Punjab", "Haryana", "2"},
                    {"ABDC", "ABCD", "CDBA", "CBDA", "3"},
                    {"Miss Universe", "Miss Earth", "Miss Asia Pacific", "Miss World", "4"},
                    {"Credit of salary", "Resignation", "Promotion", "Appointment", "3"}
            },
            {

                    {"Mobile Phone", "Computer Mouse", "Bluetooth Mouse", "Digital camera", "2"},
                    {"The Royal baby", "Telangana", "INS Vikrant", "Nargis' last unreleased film", "2"},
                    {"Raita", "Papdi", "Sabji", "Pulaav", "3"},
                    {"Sumitra", "Bharata", "Dasharatha", "Manthara", "4"},
                    {"Muhammad Iqbal", "Bankim Chandra Chatterjee", "RabindraNath Tagore", "Sri Aurobindo", "3"},
                    {"Vishwamitra", "Durvasa", "Kanva", "Kapil", "2"},
                    {"Anju Bobby George", "Anjali Bhagwat", "Krishna Poonia", "Mary Kom", "3"},
                    {"Munna", "D K Bose", "Milkha", "Lola", "3"},
                    {"Queens Park Rangers", "Newcastle United", "Liverpool", "Manchester City", "4"},
                    {"Gautam Ghose", "Rituparno Ghosh", "Buddhadeb Dasgupta", "Aparna Sen", "2"}
            },
            {
                    {"Diamond Harbour", "Darjeeling", "Murshidabad", "Dhaka", "1"},
                    {"K R Narayan", "A P J Abdul Kalam", "R Venkataraman", "Shankar Dayal Sharma", "1"},
                    {"Trunk Call", "Telegram", "Post Card", "Toy Train", "2"},
                    {"Rahul", "Sanjay", "Varun", "Rajiv", "3"},
                    {"Badrinath", "Kedarnath", "Vaishano Devi", "Amarnath", "2"},
                    {"Brendon McCullum", "Suresh Raina", "Chris Gayle", "Virat Kohli", "3"},
                    {"Aansu", "Prem Pathik", "kaanan Kusum", "Kamayani", "4"},
                    {"Irfan and Yusuf Pathan", "Ravindra and Ajay Jadeja", "Bhuvneshwar and Vinay Kumar", "Ishant and Rohit Sharma", "1"},
                    {"Capris", "Bikini", "Bermuda", "Hoodie", "2"},
                    {"Shiva", "Himalaya", "Parvati", "Kartikeya", "1"}
            },
            {
                    {"Charles Duke", "James A Lovell", "Alan Bean", "Pete Conrad", "2"},
                    {"The Ransom of Red Chief", "The Gift of the Magi", "The Last leaf", "The Third Ingredient", "3"},
                    {"Vaishakhi", "Makar Sankranti", "Vasant Panchami", "Narak Chaturdashi", "2"},
                    {"AADMI", "PURUSH", "MARD", "MAANAV", "3"},
                    {"Bhuvneshwar Kumar", "Shikhar Dhawan", "Ravinder Jadeja", "Mahendra Singh Dhoni", "4"},
                    {"Dashing Phone", "Cool Phone", "Smartphone", "Long Phone", "3"},
                    {"Bangladesh", "Nepal", "China", "Sri Lanka", "2"},
                    {"Rudra", "Nataraja", "Ardhanarishwara", "Bhairava", "2"},
                    {"Gwalior", "Alwar", "Bhopal", "Rampur", "3"},
                    {"Blood Money", "Talaash", "Chakrvayuh", "Special 26", "4"}
            },
            {
                    {"Meghnad Saha", "Subrahmanyan Chandrasekhar", "Prabodh Chandra Sengupta", "Vainu Bappu", "1"},
                    {"Genda", "Gulaab", "Gudaudi", "Gulbahar", "2"},
                    {"Bulle Shah", "Nizamuddin Aulia", "Moinuddin chisti", "Shahbaz Kalandar", "4"},
                    {"Bharuch", "Surat", "Porbandar", "Khambat", "2"},
                    {"Sant Ravidas Nagar", "Sant Kabir Nagar", "Ambedhkar Nagar", "Gautam Buddh Nagar", "4"},
                    {"Not taking Wickets", "Not winning tosses", "Not bowling full tosses", "Not Scoring runs", "4"},
                    {"Anupam Kher", "Paresh Rawal", "Boman irani", "Satish Kasushik", "2"},
                    {"Ugaane waale ka kaam", "Kharidne waale kaa daam", "Pakaane waale ka paigam", "Khaane waale ka naam", "4"},
                    {"Sukma", "Bastar", "Dantewada", "Mahasamund", "2"},
                    {"Ambani", "Tata", "Birla", "Bajaj", "3"}
            },
            {
                    {"Viewership of an IPL match", "Election expenditure", "Population of countries", "Films box office collections", "4"},
                    {"Points", "Playing sessions", "Headgears", "Punches", "4"},
                    {"Jammu", "Vidarbha", "Saurashtra", "Bundelkhand", "1"},
                    {"Acharya Vinoba Bhave", "Sant Kabir", "Mahatma Gandhi", "Gul Ahmed", "2"},
                    {"Natwest Series", "Asia Cup", "ICC Championship Trophy", "Twenty20 World Cup", "3"},
                    {"Dust", "Water vapour", "Smoke", "Sunlight", "2"},
                    {"BDAC", "ABCD", "DBCA", "DCBA", "1"},
                    {"Rectangle", "Square", "Triangle", "Pentagon", "3"},
                    {"A", "B", "C", "K", "4"},
                    {"Polar Bear", "Grizzly Bear", "Royal Bengal Tiger", "Gorilla", "1"}
            }};
*/

    /*




*/


String ques[][]=new String[12][20];
    String ans[][][]=new String[12][20][5];


        TextView tv,timerTv;

    int t,k=1,aa=0,an,cbutton=0,wbutton=0;
    MediaPlayer song;
    MediaPlayer mp3,music;
    Button bt1, bt2, bt3, bt4,btx2,bt50,btpc,btexpert,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    Boolean songIsPlaying=false,appOutOfFocus=false,mp3IsPlaying=false,musicIsPlaying=false;
    Boolean bt50used=false,btpcused=false,btexpertused=false,btx2used=false;
    Handler handler;
    int time,tim;
    Runnable r;
    Random rand = new Random();

    int c,num=0, index, answer,songDuration,mp3Duration;
    Bundle savedInstanceState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        index = 0;
num=Integer.parseInt(getIntent().getStringExtra("k"));
getQues(num);
getAnswer(num);
        tv = (TextView) findViewById(R.id.tv);
        timerTv = (TextView) findViewById(R.id.timerTv);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt50 = (Button) findViewById(R.id.bt50);
        btx2 = (Button) findViewById(R.id.btx2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        btexpert = (Button) findViewById(R.id.btexpert);
        btpc = (Button) findViewById(R.id.btpc);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt50.setOnClickListener(this);
        btx2.setOnClickListener(this);
        btexpert.setOnClickListener(this);
        btpc.setOnClickListener(this);


        if(savedInstanceState==null) {
            setQuestion();

        }
        else{
            num=savedInstanceState.getInt("num");
           getQues(num);
            getAnswer(num);
            index=savedInstanceState.getInt("index");
            bt50used=savedInstanceState.getBoolean("bt50used");
            btpcused=savedInstanceState.getBoolean("btpcused");
            btexpertused=savedInstanceState.getBoolean("btexpertused");
            btx2used=savedInstanceState.getBoolean("btx2used");
            if(bt50used)
            {
                bt50.setEnabled(false);
                bt50.setClickable(false);
                bt50.setBackgroundResource(R.drawable.b50used);
            }
            if(btpcused)
            {
                btpc.setEnabled(false);
                btpc.setClickable(false);
                btpc.setBackgroundResource(R.drawable.bpcused);
            }
            if(btexpertused)
            {
                btexpert.setEnabled(false);
                btexpert.setClickable(false);
                btexpert.setBackgroundResource(R.drawable.bexpertused);
            }
            if(btx2used)
            {
                btx2.setEnabled(false);
                btx2.setClickable(false);
                btx2.setBackgroundResource(R.drawable.bx2used);
            }
if(savedInstanceState.getBoolean("isSongPlaying"))
{
    tv.setText("");
    bt1.setText("");
    bt2.setText("");
    bt3.setText("");
    bt4.setText("");


    if (index == 0) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques1);
        song.start();
        song.seekTo(savedInstanceState.getInt("time"));
        t=song.getDuration()-savedInstanceState.getInt("time");
    }
    if (index == 1) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques2);
        song.start();
        t=song.getDuration()-savedInstanceState.getInt("time");
    }
    if (index == 2) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques3);
        song.start();
        t=song.getDuration()-savedInstanceState.getInt("time");
    }
    if (index == 3) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques4);
        song.start();
        t=song.getDuration();
    }
    if (index == 4) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques5);
        song.start();
        t=song.getDuration();
    }
    if (index == 5) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques6);
        song.start();
        t=song.getDuration();
    }
    if (index == 6) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques7);
        song.start();
        t=song.getDuration();
    }
    if (index == 7) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques8);
        song.start();
        t=song.getDuration();
    }
    if (index == 8) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques9);
        song.start();
        t=song.getDuration();
    }
    if (index == 9) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques10);
        song.start();
        t=song.getDuration();
    }
    if (index == 10) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques11);
        song.start();
        t=song.getDuration();
    }
    if (index == 11) {
        song = MediaPlayer.create(MainActivity.this, R.raw.ques12);
        song.start();
        t=song.getDuration();
    }
    song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            if(song.isPlaying())
                song.stop();
            song.reset();
            song.release();
            song=null;
            if(num<=2)
            c = rand.nextInt(20);
else
            c = rand.nextInt(10);



            tv.setText(ques[index][c]);
            bt1.setText(ans[index][c][0]);
            bt2.setText(ans[index][c][1]);
            bt3.setText(ans[index][c][2]);
            bt4.setText(ans[index][c][3]);


            mp3 = MediaPlayer.create(MainActivity.this, R.raw.ticktok);
            mp3.start();
            time =30000;
            handler=new Handler();
            r=new Runnable() {
                @Override
                public void run() {
                    time=time-1000;
                    if(time>0)
                    {
                        timerTv.setText(""+(time/1000));
                        handler.postDelayed(r,1000);
                    }
                    else
                    {
                        mp3.stop();
                        mp3=null;
                        Intent i = new Intent(MainActivity.this, Result.class);
                        i.putExtra("ans", "" + (index + 1));
                        startActivity(i);
                    }
                }
            };
            handler.postDelayed(r,1000);


        }
    });
}
 if(savedInstanceState.getBoolean("isMp3Playing"))
 {
     setColor();
     c=savedInstanceState.getInt("c");
     mp3=MediaPlayer.create(this,R.raw.ticktok);
     mp3.start();
     mp3.seekTo(savedInstanceState.getInt("time"));
     tv.setText(ques[index][c]);
     bt1.setText(ans[index][c][0]);
     bt2.setText(ans[index][c][1]);
     bt3.setText(ans[index][c][2]);
     bt4.setText(ans[index][c][3]);
     time =savedInstanceState.getInt("timer");
     handler=new Handler();
     r=new Runnable() {
         @Override
         public void run() {
             time=time-1000;
             if(time>0)
             {
                 timerTv.setText(""+(time/1000));
                 handler.postDelayed(r,1000);
             }
             else
             {
                 Intent i = new Intent(MainActivity.this, Result.class);
                 i.putExtra("ans", "" + (index + 1));
                 startActivity(i);
             }
         }
     };
     handler.postDelayed(r,1000);




 }

if(savedInstanceState.getBoolean("isMusicPlaying"))
{
    setColor();
    c=savedInstanceState.getInt("c");
    aa=savedInstanceState.getInt("aa");
    tv.setText(ques[index][c]);
    bt1.setText(ans[index][c][0]);
    bt2.setText(ans[index][c][1]);
    bt3.setText(ans[index][c][2]);
    bt4.setText(ans[index][c][3]);
    if(aa==1)
    {
        music=MediaPlayer.create(this,R.raw.correct);
        music.start();
        music.seekTo(savedInstanceState.getInt("time"));
        cbutton=savedInstanceState.getInt("cbutton");
        if(cbutton==1)
            bt1.setBackgroundResource(R.drawable.bac);
        else if(cbutton==2)
            bt2.setBackgroundResource(R.drawable.bbc);
        else if(cbutton==3)
            bt3.setBackgroundResource(R.drawable.bcc);
        else if(cbutton==4)
            bt4.setBackgroundResource(R.drawable.bdc);
        music.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                index++;


                setQuestion();
            }
        });

    }
    else{
        music=MediaPlayer.create(this,R.raw.wrong);
        music.start();
        music.seekTo(savedInstanceState.getInt("time"));
        cbutton=savedInstanceState.getInt("cbutton");
        wbutton=savedInstanceState.getInt("wbutton");
   if(wbutton==1)
   bt1.setBackgroundResource(R.drawable.baw);
        else if(wbutton==2)
       bt2.setBackgroundResource(R.drawable.bbw);
   else if(wbutton==3)
       bt3.setBackgroundResource(R.drawable.bcw);
   else if(wbutton==4)
       bt4.setBackgroundResource(R.drawable.bdw);
        if(cbutton==1)
            bt1.setBackgroundResource(R.drawable.bac);
        else if(cbutton==2)
            bt2.setBackgroundResource(R.drawable.bbc);
        else if(cbutton==3)
            bt3.setBackgroundResource(R.drawable.bcc);
        else if(cbutton==4)
            bt4.setBackgroundResource(R.drawable.bdc);
        /*     time = music.getDuration()-savedInstanceState.getInt("time");
        handler = new Handler();
        r = new Runnable() {
            @Override
            public void run() {
                time = time - 1000;
                if (time < 6000 && time>0) {

                    handler.postDelayed(r, 1000);
                }else if(time>0)
                {
                    handler.postDelayed(r,1000);
                }
                else {
                    Intent i = new Intent(MainActivity.this, Result.class);
                    i.putExtra("ans", "" + (index + 1));
                    startActivity(i);
                }
            }
        };

        handler.postDelayed(r, 1000);
    */
        music.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                //  music.stop();
                music.release();
                music=null;
                Intent i = new Intent(MainActivity.this, Result.class);
                i.putExtra("ans", "" + (index + 1));
                startActivity(i);
            }
        });

    }



}








        }
    }



    @Override
    public void onClick(View v) {

        answer = Integer.parseInt(ans[index][c][4]);
        switch (v.getId()) {
            case R.id.bt1:
                bt1.setBackgroundResource(R.drawable.bselected);
                mp3.stop();
mp3.reset();
                mp3.release();
                mp3 = null;

                handler.removeCallbacks(r);
                if (answer == 1) {
// an will get which button is pressed................................
                    an = 1;
//aa will get aa=0 when answer is wrong and aa=1 when answer is correct..............................
                    aa = 1;
                    cbutton=1;
                    correctAnswer(an);


                } else {
                    aa = 0;
                    wbutton=1;
                    if(ans[index][c][4].equals("2"))
                        cbutton=2;
                    if(ans[index][c][4].equals("3"))
                        cbutton=3;
                    if(ans[index][c][4].equals("4"))
                        cbutton=4;
                    wrongAnswer(Integer.parseInt(ans[index][c][4]), 1);
                }
                break;

            case R.id.bt2:
                bt2.setBackgroundResource(R.drawable.bselected);
                mp3.stop();
                handler.removeCallbacks(r);
                mp3.reset();
                mp3.release();
                music = null;
                mp3 = null;
                if (answer == 2) {
                    cbutton=2;
                    aa = 1;
                    correctAnswer(2);


                } else {
                    aa = 0;
                    wrongAnswer(Integer.parseInt(ans[index][c][4]), 2);
                    wbutton=2;
                    if(ans[index][c][4].equals("1"))
                        cbutton=1;
                    if(ans[index][c][4].equals("3"))
                        cbutton=3;
                    if(ans[index][c][4].equals("4"))
                        cbutton=4;
                }
                break;

            case R.id.bt3:
                bt3.setBackgroundResource(R.drawable.bselected);
                mp3.stop();
                mp3.reset();
                handler.removeCallbacks(r);
                mp3.release();
                mp3 = null;
                if (answer == 3) {
                    cbutton=3;
                    aa = 1;
                    an = 3;
                    correctAnswer(3);

                } else {
                    aa = 0;
                    wrongAnswer(Integer.parseInt(ans[index][c][4]), 3);
                    wbutton=3;
                    if(ans[index][c][4].equals("2"))
                        cbutton=2;
                    if(ans[index][c][4].equals("1"))
                        cbutton=1;
                    if(ans[index][c][4].equals("4"))
                        cbutton=4;
                }
                break;
            case R.id.bt4:
                bt4.setBackgroundResource(R.drawable.bselected);
                mp3.stop();
                handler.removeCallbacks(r);
                mp3.reset();
                mp3.release();
                mp3 = null;
                if (answer == 4) {
                    cbutton=4;
                    aa = 1;
                    correctAnswer(4);

                } else {
                    aa = 0;
                    wrongAnswer(Integer.parseInt(ans[index][c][4]), 4);
                    wbutton=4;
                    if(ans[index][c][4].equals("2"))
                    if(ans[index][c][4].equals("3"))
                        cbutton=2;
                    if(ans[index][c][4].equals("1"))
                        cbutton=1;
                }
                break;

            case R.id.bt50:
                bt50used=true;
                int n = 0,j=5;
                int a = Integer.parseInt(ans[index][c][4]);
                while (n != 2) {

                    int k = 1 + rand.nextInt(4);
                    if (k != a && k!=j) {

                        if (k == 1) {
                            bt1.setEnabled(false);
                            bt1.setText("");
                        }
                        if (k == 2) {
                            bt2.setEnabled(false);
                            bt2.setText("");
                        }
                        if (k == 3) {
                            bt3.setEnabled(false);
                            bt3.setText("");
                        }
                        if (k == 4) {
                            bt4.setEnabled(false);
                            bt4.setText("");
                        }
                        j=k;
                        n++;
                    }
                }

                bt50.setEnabled(false);
                bt50.setBackgroundResource(R.drawable.b50used);

                break;

            case R.id.btpc:
                btpcused=true;
                a = Integer.parseInt(ans[index][c][4]);
                int a1 = 0, b1 = 0, c1 = 0, d1 = 0;
                if (a == 1) {
                    while(b1==0 && c1==0 && d1==0) {
                        a1 = rand.nextInt(51) + 50;
                        b1 = rand.nextInt(101 - a1);
                        c1 = rand.nextInt(101 - a1 - b1);
                        d1 = 100 - a1 - b1 - c1;
                    }
                }
                if (a == 4) {
                    while(b1==0 && c1==0 && a1==0) {
                        d1 = rand.nextInt(51) + 50;
                        b1 = rand.nextInt(101 - d1);
                        c1 = rand.nextInt(101 - d1 - b1);
                        a1 = 100 - d1 - b1 - c1;
                    }
                }
                if (a == 2) {
                    while(c1==0 && d1==0 && a1==0) {
                        b1 = rand.nextInt(51) + 50;
                        a1 = rand.nextInt(101 - b1);
                        c1 = rand.nextInt(101 - a1 - b1);
                        d1 = 100 - a1 - b1 - c1;
                    }
                }
                if (a == 3) {
                    while(a1==0 && b1==0 && d1==0) {
                        c1 = rand.nextInt(51) + 50;
                        b1 = rand.nextInt(101 - c1);
                        a1 = rand.nextInt(101 - c1 - b1);
                        d1 = 100 - a1 - b1 - c1;
                    }
                }
                btpc.setBackgroundResource(R.drawable.bpcused);
                btpc.setEnabled(false);
                Intent i = new Intent(MainActivity.this, Chart.class);
                String mass = "" + a1 + "/" + b1 + "/" + c1 + "/" + d1 + "/";
                i.putExtra("score", mass);
                startActivity(i);
                break;

            case R.id.btexpert:
                btexpertused=true;
mass="";
                    a = Integer.parseInt(ans[index][c][4]);
                if (a == 1)
                    mass = "A";
                if (a == 2)
                    mass = "B";
                if (a == 3)
                    mass = "C";
                if (a == 4)
                    mass = "D";

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("EXPERT OPENION");
                alertDialogBuilder.setIcon(R.drawable.logo);
                alertDialogBuilder.setCancelable(false);
                alertDialogBuilder.setMessage("ANSWER ACCORDING TO OUR EXPERT IS OPTION :" + " " + mass);
                alertDialogBuilder.setPositiveButton("GO BACK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();


                btexpert.setEnabled(false);

                btexpert.setBackgroundResource(R.drawable.bexpertused);
                break;
            case R.id.btx2:
                int k=c;
            while(k==c)
            {
                if(num<=2)
                k=rand.nextInt(20);
                else
                k=rand.nextInt(20);
            }
                c=k;
            tv.setText(ques[index][c]);
                bt1.setText(ans[index][c][0]);
                bt2.setText(ans[index][c][1]);
                bt3.setText(ans[index][c][2]);
                bt4.setText(ans[index][c][3]);
                btx2.setBackgroundResource(R.drawable.bx2used);
                btx2.setEnabled(false);
                btx2.setClickable(false);
handler.removeCallbacks(r);
                time=30000;
handler.postDelayed(r,1000);
                btx2used=true;
            break;
        }
    }
    public void setQuestion() {
if(index==12)
{
    if(song!=null)
    {
        if(song.isPlaying())
            song.stop();
        song.reset();
        song.release();
    }
    Intent i = new Intent(MainActivity.this, Result.class);
    i.putExtra("index",""+index);

    startActivity(i);
    finish();
}



        if(index != 12)
        {
            btexpert.setEnabled(false);
        btpc.setEnabled(false);
        bt50.setEnabled(false);
            btx2.setEnabled(false);
        bt1.setClickable(false);
        bt2.setClickable(false);
        bt3.setClickable(false);
        bt4.setClickable(false);
            tv.setText("");
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
        t = 0;

        if (index == 0) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques1);
            song.start();
            t = song.getDuration();
        }
        if (index == 1) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques2);
            song.start();
            t = song.getDuration();
        }
        if (index == 2) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques3);
            song.start();
            t = song.getDuration();
        }
        if (index == 3) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques4);
            song.start();
            t = song.getDuration();
        }
        if (index == 4) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques5);
            song.start();
            t = song.getDuration();
        }
        if (index == 5) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques6);
            song.start();
            t = song.getDuration();
        }
        if (index == 6) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques7);
            song.start();
            t = song.getDuration();
        }
        if (index == 7) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques8);
            song.start();
            t = song.getDuration();
        }
        if (index == 8) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques9);
            song.start();
            t = song.getDuration();
        }
        if (index == 9) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques10);
            song.start();
            t = song.getDuration();
        }
        if (index == 10) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques11);
            song.start();
            t = song.getDuration();
        }
        if (index == 11) {
            song = MediaPlayer.create(MainActivity.this, R.raw.ques12);
            song.start();
            t = song.getDuration();
        }

        song.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                setColor();
                if(index!=0)
                    removeColor(index);
                bt1.setClickable(true);
                bt2.setClickable(true);
                bt3.setClickable(true);
                bt4.setClickable(true);
                bt1.setEnabled(true);
                bt2.setEnabled(true);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                if (!btexpertused)
                    btexpert.setEnabled(true);
                if (!bt50used)
                    bt50.setEnabled(true);
                if (!btpcused)
                    btpc.setEnabled(true);
                if(!btx2used)
                    btx2.setEnabled(true);
                if(song!=null)
                {
                    if(song.isPlaying())
                        song.stop();
                    song.reset();
                    song.release();
                }

                song = null;
                if(num<=2)
                c = rand.nextInt(20);
                else
                c = rand.nextInt(10);

                tv.setText(ques[index][c]);
                bt1.setText(ans[index][c][0]);
                bt2.setText(ans[index][c][1]);
                bt3.setText(ans[index][c][2]);
                bt4.setText(ans[index][c][3]);


                mp3 = MediaPlayer.create(MainActivity.this, R.raw.ticktok);
                mp3.start();
                time = 30000;
                handler = new Handler();
                r = new Runnable() {
                    @Override
                    public void run() {
                        time = time - 1000;
                        final Animation animShake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shakeanim);
                        if(time%5000==0) {
                            if(!bt50used)
                            bt50.startAnimation(animShake);
                       if(!btpcused)
                        btpc.startAnimation(animShake);
                        if(!btexpertused)
                            btexpert.startAnimation(animShake);
                        if(!btx2used)
                            btx2.startAnimation(animShake);
                        }if (time > 0) {
                            timerTv.setText("" + (time / 1000));
                            handler.postDelayed(r, 1000);
                        } else {
                            Intent i = new Intent(MainActivity.this, Result.class);
                            i.putExtra("index",""+index);

                            startActivity(i);
                            finish();
                        }
                    }
                };
                handler.postDelayed(r, 1000);


            }
        });
    } }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("this","OnStart Called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d("this"," On Save Instance State Called");
outState.putInt("index",index);
        outState.putInt("num",num);
        outState.putBoolean("bt50used",bt50used);
        outState.putBoolean("btpcused",btpcused);
        outState.putBoolean("btexpertused",btexpertused);
        outState.putBoolean("btx2used",btx2used);
        if(songIsPlaying)
{
    outState.putBoolean("isSongPlaying",true);
    outState.putBoolean("isMp3Playing",false);
    outState.putBoolean("isMusicPlaying",false);
    outState.putInt("time",song.getCurrentPosition());
}
if(mp3IsPlaying)
{
    outState.putBoolean("isMp3Playing",true);
    outState.putBoolean("isMusicPlaying",false);
    outState.putBoolean("isSongPlaying",false);
    outState.putInt("c",c);
    outState.putInt("time",mp3.getCurrentPosition());
    outState.putInt("timer",time);
}
        if(musicIsPlaying)
        {    outState.putBoolean("isMp3Playing",false);
            outState.putBoolean("isMusicPlaying",true);
            outState.putBoolean("isSongPlaying",false);
outState.putInt("time",music.getCurrentPosition());
            outState.putInt("c",c);
            outState.putInt("aa",aa);
            outState.putInt("cbutton",cbutton);
            outState.putInt("wbutton",wbutton);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("this","On Resume Called");
        if(songIsPlaying)
        {
            songIsPlaying=false;
            song.start();
        }
        else if(mp3IsPlaying)
        {
            mp3.start();
            time=tim;
            mp3IsPlaying=false;
            tv.setText(ques[index][c]);
            bt1.setText(ans[index][c][0]);
            bt2.setText(ans[index][c][1]);
            bt3.setText(ans[index][c][2]);
            bt4.setText(ans[index][c][3]);
            time=tim;
            handler=new Handler();
            r=new Runnable() {
                @Override
                public void run() {
                    time=time-1000;
                    if(time>0)
                    {
                        timerTv.setText(""+(time/1000));
                        handler.postDelayed(r,1000);
                    }
                    else
                    {
                        Intent i = new Intent(MainActivity.this, Result.class);
                        i.putExtra("ans", "" + (index + 1));
                        startActivity(i);
                    }
                }
            };
            handler.postDelayed(r,1000);


        }
        else if(musicIsPlaying)
        {
            musicIsPlaying=false;
            music.start();

        }

    }






    @Override
    protected void onStop() {
        super.onStop();
        Log.d("this","OnStop Called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("this","OnPause Called");
        if(song !=null) {
            if (song.isPlaying() &&  song.getCurrentPosition() <= song.getDuration()) {
                songIsPlaying = true;
                song.pause();
                Log.d("this",""+song.getCurrentPosition());
                mp3IsPlaying = false;
                musicIsPlaying = false;
            }
        }
        if(mp3!=null) {
            if (mp3.isPlaying() && mp3.getCurrentPosition() <= mp3.getDuration()) {
                mp3IsPlaying = true;
                songIsPlaying = false;
                musicIsPlaying = false;
                tim = time;
                mp3.pause();
                handler.removeCallbacks(r);
            }
        }
        if(music!=null) {
            if (music.isPlaying() && music.getCurrentPosition() <= music.getDuration()) {
                musicIsPlaying = true;
                songIsPlaying = false;
                mp3IsPlaying = false;
                music.pause();

            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        Log.d("this","OnDestroy Called");
    }

// Method When Correct Answer Is Pressed.................................................................................
    public void correctAnswer(final int an)
    {
        bt1.setClickable(false);
        bt2.setClickable(false);
        bt3.setClickable(false);
        bt4.setClickable(false);
        btexpert.setEnabled(false);
        btpc.setEnabled(false);
        bt50.setEnabled(false);
        music =MediaPlayer.create(this,R.raw.correct);
        music.start();

         long duration=music.getDuration();
        new CountDownTimer(duration, 1000) {
            public void onTick(long time) {

                if(time<8000){
                    if(an==1)
                    bt1.setBackgroundResource(R.drawable.bac);
                if(an==2)
                    bt2.setBackgroundResource(R.drawable.bbc);
                if(an==3)
                    bt3.setBackgroundResource(R.drawable.bcc);
                if(an==4)
                    bt4.setBackgroundResource(R.drawable.bdc);
            }}

            public void onFinish() {
                if(an==1)
                bt1.setBackgroundResource(R.drawable.ba);

                if(an==2)
                    bt2.setBackgroundResource(R.drawable.bb);
                if(an==3)
                    bt3.setBackgroundResource(R.drawable.bc);
                if(an==4)
                    bt4.setBackgroundResource(R.drawable.bd);
            }
        }.start();
        music.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                index++;
                timerTv.setText("");
                handler.removeCallbacks(r);

                setQuestion();
            }
        });
    }
// Method of Correct Answer Ends Here.......................................................................................


public void wrongAnswer(final int cans,final int wans)
{
    bt1.setClickable(false);
    bt2.setClickable(false);
    bt3.setClickable(false);
    bt4.setClickable(false);
    btexpert.setEnabled(false);
    btpc.setEnabled(false);
    bt50.setEnabled(false);
    music= MediaPlayer.create(this,R.raw.wrong);
    music.start();
    final long duration =music.getDuration();
    new CountDownTimer(duration, 1000) {
        public void onTick(long time) {
int k=0;
            if (time < 6000) {
k++;
        if(wans==1)
            bt1.setBackgroundResource(R.drawable.baw);
                if(wans==2)
                    bt2.setBackgroundResource(R.drawable.bbw);
                if(wans==3)
                    bt3.setBackgroundResource(R.drawable.bcw);
                if(wans==4)
                    bt4.setBackgroundResource(R.drawable.bdw);

        if(cans==1)
            bt1.setBackgroundResource(R.drawable.rightwrong);
        if(cans==2)
            bt2.setBackgroundResource(R.drawable.rightwrong);

        if(cans==3)
            bt3.setBackgroundResource(R.drawable.rightwrong);

        if(cans==4)
            bt4.setBackgroundResource(R.drawable.rightwrong);

            }


        }
        public void onFinish() {

        }
    }.start();





    music.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            //      music.stop();
            music.release();
            music=null;
            Intent i = new Intent(MainActivity.this, Result.class);
            i.putExtra("index", ""+index);
            startActivity(i);
            finish();
        }
    });
}


public void setColor()
{
    if(index==0)
    button1.setBackgroundResource(R.drawable.bans);
    if(index==1)
        button2.setBackgroundResource(R.drawable.bans);
    if(index==2)
        button3.setBackgroundResource(R.drawable.bans);
    if(index==3)
        button4.setBackgroundResource(R.drawable.bans);
    if(index==4)
        button5.setBackgroundResource(R.drawable.bans);
    if(index==5)
        button6.setBackgroundResource(R.drawable.bans);
    if(index==6)
        button7.setBackgroundResource(R.drawable.bans);
    if(index==7)
        button8.setBackgroundResource(R.drawable.bans);
    if(index==8)
        button9.setBackgroundResource(R.drawable.bans);
    if(index==9)
    button10.setBackgroundResource(R.drawable.bans);
    if(index==10)
        button11.setBackgroundResource(R.drawable.bans);
    if(index==11)
        button12.setBackgroundResource(R.drawable.bans);



}
public void removeColor(int i){

    if(i==1)
        button1.setBackgroundResource(R.drawable.bsback);
    if(i==2)
        button2.setBackgroundResource(R.drawable.bsback);
    if(i==3)
        button3.setBackgroundResource(R.drawable.bsback);
    if(i==4)
        button4.setBackgroundResource(R.drawable.bsback);
    if(i==5)
        button5.setBackgroundResource(R.drawable.bsback);
    if(i==6)
        button6.setBackgroundResource(R.drawable.bsback);
    if(i==7)
        button7.setBackgroundResource(R.drawable.bsback);
    if(i==8)
        button8.setBackgroundResource(R.drawable.bsback);
    if(i==9)
        button9.setBackgroundResource(R.drawable.bsback);
    if(i==10)
        button10.setBackgroundResource(R.drawable.bsback);
    if(i==11)
        button11.setBackgroundResource(R.drawable.bsback);

}

    public void getQues(int k)
    {
        if(k==1){
            String que[][]={
                    {"Sahil sharma makes tea.",
                            " My father loves me.",
                            "We hate him.",
                            " Savita does not like me.",
                            "He is making a film.",
                            "Shivu is singing a song.",
                            "My friends are watching the match.",
                            "My mother is cooking food.",
                            "They are not playing the game.",
                            " My father has solved this matter.",
                            " Priyanka has written these notes.",
                            " Someone has stolen his book.",
                            "I have given him a perfume.",
                            " He stole that watch.",
                            " Sahil spoke the lie.",
                            "Thief killed him.",
                            "The police caught the culprit.",
                            " He was writing a love letter.",
                            " The farmer was ploughing the fields.",
                            "Sita was reading the Gita."
                    },
                    {
                            "They had not done their tasks.",
                            "Somebody had already adopted him.",
                            "Rahul will pass the message.",
                            "He will hate me.",
                            " The police will have caught the culprit.",
                            " Sunder will have closed the door.",
                            " I must help him.",
                            "He can speak French.",
                            " They may win the battle.",
                            " Nobody can catch him.",
                            " We must have obeyed our teachers.",
                            "Rahul mush have done that task.",
                            "We ought to have saved our environment.",
                            "There is no book to read.",
                            " There is nothing to do.",
                            " It is time to prepare for the game trails.",
                            "It is time to learn English.",
                            " It is time to do our business.",
                            "He like people to respect him.",
                            " Rahul has to see it or to believe it."
                    }
                    ,
                    {
                            "Switch on the cooler.",
                            " Bring the bottle of juice.",
                            " Don't insult the deaf man.",
                            "Don't touch the fence.",
                            "Help the poor.",
                            "Respect your neighbours.",
                            "Please give me a pen.",
                            "Please tell me something.",
                            "Let me do this task.",
                            "Let him do this work.",
                            "Let us play.",
                            "Let us sing.",
                            "Sit down.",
                            "Did he buy a car ?",
                            "Will nobody help the Sheetal ?",
                            "Why does he beat his brother ?",
                            "Where do they buy the utensils ?",
                            "Who taught you English ?",
                            "Who wrote this book ?",
                            "Who wrote this noble ?"
                    },
                    {
                            "Idioms and Phrases for : At one's wit's end",
                            "Idioms and Phrases for : At one's fingertips",
                            "Idioms and Phrases for : At the spur of the moment",
                            "Idioms and Phrases for : All in all",
                            "Idioms and Phrases for : At close quarters",
                            "Idioms and Phrases for : Apple Pie Order",
                            "Idioms and Phrases for : Above board",
                            "Idioms and Phrases for : As fit as a fiddle",
                            "Idioms and Phrases for : At logger heads",
                            "Idioms and Phrases for : An apple of discord",
                            "Idioms and Phrases for :  At a loss",
                            "Idioms and Phrases for : At dagger's drawn",
                            "Idioms and Phrases for : At large",
                            "Idioms and Phrases for :  At sea",
                            "Idioms and Phrases for : A bigger bang for your buck",
                            "Idioms and Phrases for : At sixes and sevens",
                            "Idioms and Phrases for : Argus eyed",
                            "Idioms and Phrases for : A load of cobblers",
                            "Idioms and Phrases for : A pig in a poke",
                            "Idioms and Phrases for : At one fell swoop"
                    },
                    {
                            "Idioms and Phrases for : Back of beyond",
                            "Idioms and Phrases for : By hook or by crook",
                            "Idioms and Phrases for : Bandy words",
                            " Idioms and Phrases for : Break the ice",
                            "Idioms and Phrases for : Bad Blood",
                            "Idioms and Phrases for : Black and Blue",
                            "Idioms and Phrases for : Brow Beat",
                            "Idioms and Phrases for : Bid defiance",
                            "Idioms and Phrases for : Blow one's trumpet",
                            "Idioms and Phrases for : Bury the hatchet",
                            "Idioms and Phrases for : Bring to book",
                            "Idioms and Phrases for : Blaze the trail",
                            "Idioms and Phrases for : Broken Reed",
                            "Idioms and Phrases for : By dint of",
                            "Idioms and Phrases for : Charley horse",
                            "Idioms and Phrases for :  Cart before the horse",
                            "Idioms and Phrases for : Chalk and Cheese",
                            "Idioms and Phrases for : Cry for the moon",
                            "Idioms and Phrases for :  Carry the day",
                            "Idioms and Phrases for : Cloven hoof"
                    },
                    {
                            " He said to me, \"I am ready\".",
                            " Sonia said, \"You help my sister\".",
                            "They said, \"We can not live without oxygen\".",
                            "Rahul said to me, \"We are mortal\".",
                            "The Indian express says, \"We shall issue a astrology section in our Thursday's paper\".",
                            "John says, \"I shall go there\".",
                            "Robert will say to me, \"I am your classmate\".",
                            "Sushant said to him, \"I have been helping your son for years\".",
                            "He said to me, \"I shall write an essay\".",
                            "He said to me, \"I shall be writing an essay\".",
                            "Sita said to Geeta, \"You can learn piano\".",
                            "He said to you, \"You may go out\".",
                            " Ram said to Rahul, \"You are a good player of cricket\".",
                            "Shahekant said to me, \"I have no time for you\".",
                            "Sahil said to Deepu, \"I was going to buy milk\".",
                            "She said, \"You were missing from the picnic\".",
                            "Reeta said Shivani, \"You have to go to school\".",
                            "You said to her, \"She has to cook food for you\".",
                            " He said to me, \" I had to finish this first\".",
                            "Rahul said to Shusheela, \"I had to reach there\"."
                    },
                    {
                            " Reema said to Jitender, \"You would not fight with me.\"",
                            "My father said to me, \"It might rain yesterday\".",
                            "He said, \"I went to Rajesthan yesterday.\"",
                            "Raju said to me, \"He worked hard\".",
                            "Rahul said, \" He was walking.\"",
                            "Sheela said to me, \"Munni is dancing better than me.\"",
                            "She said, \"He was trying to help me\".",
                            "Deepak said to me, \"I had finished the coffee.\"",
                            "Rahul said to me, \" I had gone through it.\"",
                            "Baljider said to me, \"I had been working on it for 5 days.\"",
                            "Sweety said to me, \"I had been writing an essay for 3 hours.\"",
                            " Rahul said, \"I can buy that watch.\"",
                            "He said, \"Honesty is the best policy.\"",
                            "He remarked, \"Two and two makes four.\"",
                            "My father said, \"All that glitters is not gold.\"",
                            "Rahul said, \"We must obey our parents.\"",
                            "Sheela said, \"I must go.\"",
                            "Rakhi says to him, \"You must come back home in time.\"",
                            "The MLA said to people, \"Ladies and gentlemen, your vote is my real power.\"",
                            "She said, \"Well, Rahul, You have done this work.\""
                    }
                    ,
                    {
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :"
                    }
                    ,
                    {
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :",
                            "Spelling test - find correct spelling :"
                    }
                    ,
                    {
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English"
                    },
                    {
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English",
                            " Spotting errors in English"
                    },
                    {
                            "Synonym of ABANDON",
                            "Synonym of ABDICATE",
                            "Synonym of ABSOLUTE",
                            "Synonym of ABSTAIN",
                            "Synonym of ACCORD",
                            "Synonym of ACQUAINT",
                            "Synonym of AGGRAVATE",
                            "Synonym of ALTRUISTIC",
                            "Synonym of ANTIPATHY",
                            " Synonym of APATHETIC",
                            "Synonym of ARROGANT",
                            "Synonym of ASSASSIN",
                            " Synonym of ASSIDUOUS",
                            "Synonym of AUDACITY",
                            "Synonym of ALACRITY",
                            "Synonym of ANTIPATHY",
                            "Synonym of ACRIMONY",
                            "Synonym of ABASH",
                            "Synonym of ADROIT",
                            "Synonym of BANDIT"
                    }
            };
            ques=que;
        }
        else if(k==2)
        {
            String que[][]={
                    {
                            "Doctor : Nurse :: ? : Follower",
                            "Moon : Satellite :: Earth : ?",
                            "Fear : Threat :: Anger : ?",
                            "Clock : Time :: Thermometer : ?",
                            "CUP : LIP :: BIRD : ?",
                            "Tractor : Trailer :: Horse : ?",
                            "Flower : Bud :: Plant : ?",
                            " Flow : River :: Stagnant : ?",
                            " Paw : Cat :: Hoof : ?",
                            "Car : Garage :: Aeroplane : ?",
                            "Venerate : Worship :: Extol : ?",
                            "Nurture : Neglect :: Denigrate : ?",
                            "Hong Kong : China :: Vatican : ?",
                            "Illiteracy : Education :: Flood : ?",
                            "Hill : Mountain :: Stream : ?",
                            "Fruit : Banana :: Mammal : ?",
                            "Fire : Ashes :: Explosion : ?",
                            "Drama : Stage :: Tennis : ?",
                            "Sculptor : Statue :: Poet : ?",
                            "Malaria : Disease :: Spear : ?"
                    },
                    {"Cricket : Bat :: Hockey : ?",
                            " Enough : Excess :: Sufficiency : ?",
                            "Skeleton : Body :: Grammar : ?",
                            "Mature : Regressed :: Varied : ?",
                            "Ship : Sea :: Camel : ?",
                            " Dilatory : Expeditious :: Direct : ?",
                            "Wrist : Elbow :: Ankle : ?",
                            "Amber : Yellow :: Caramine : ?",
                            "Wax : Wane :: Zenith : ?",
                            " Foundation : Edifice :: Constitution : ?",
                            "Video : Cassette :: Computer : ?",
                            "Produce : Waste :: Contrast : ?",
                            "Palaeography : Writings :: Ichthyology : ?",
                            "Painting : Artist :: Symphony : ?",
                            "Dawn : Dusk :: Inauguration : ?",
                            "Annihilation : Fire :: Cataclysm : ?",
                            "Entrepreneur : Profit :: Scholar : ?",
                            "Anatomy : Zoology :: Paediatrics : ?",
                            "Novice : Learner :: Harbinger : ?",
                            " Mattock : Dig :: Shovel : ?"
                    },
                    {
                            "Foresight : Anticipation :: Insomnia : ?",
                            "Wax is related to Grease in the same way as Milk is related to :",
                            "\"Life\" is related to \"Autobiography\" in the same way as \"Witness\" is related to :",
                            " \"Life\" is related to \"Death\" in the same way as \"Hope\" is related to .. ?",
                            " \"Radical\" is related to \"Moderate\" in the same way as \"Revolution\" is related to .. ?",
                            "Firm : Flabby :: Piquant : ?",
                            "Appreciation : Reward :: Disgrace : ?",
                            "Mouse : Cat :: Fly : ?",
                            "Kilogram : Quintal :: Paise : ?",
                            "Earth : Axis :: Wheel : ?",
                            "Engineer : Machine :: Doctor : ?",
                            "South : North-West :: West : ?",
                            "Pride : Humility :: Desire : ?",
                            "Boat : Oar :: Bicycle : ?",
                            "Much : Many :: Measure : ?",
                            "Lapse : Session :: Conclude : ?",
                            "Boat : Sales :: Balloon : ?",
                            " Clue : Mystery :: Warning : ?",
                            "Find analogous pair of Chalk : Blackboard",
                            "Find analogous pair of Agenda : Meeting"
                    },
                    {
                            "Find analogous pair of Elevated : Exalted",
                            "Find analogous pair of Fish : Shoal",
                            "Find analogous pair of Traffic : Road",
                            "Find analogous pair of Sprain : Fracture",
                            "Find analogous pair of Platform : Train",
                            "Find analogous pair of Weight : Kilogram",
                            " Find analogous pair of Cool : Cold",
                            " Find analogous pair of Chair : Carpenter",
                            "Find analogous pair of Sound : Muffled",
                            "Find analogous pair of Humanitarian : Altruistic",
                            "Find analogous pair of Fury : Ire",
                            "Find analogous pair of Fragile : Crack",
                            "Find analogous pair of Portico : Building",
                            " Find analogous pair of State : Exile",
                            "Find analogous pair of Lively : Dull",
                            "Find analogous pair of Mad : Insane",
                            "Find analogous pair of Pain : Ache",
                            " Find analogous pair of Agreement : Dissent",
                            "Find analogous pair of Food : Hungry",
                            "Find analogous pair of Wan : Colour"
                    },
                    {
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose the word which is least like the other words",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                            "Choose out the odd one.",
                    }
                    ,{
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose out the odd one.",
                    "Choose the pair in which the words are differently related."
            }
                    ,{
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    "Choose the pair in which the words are differently related.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    " Choose the group of letters which is different from others.",
                    "Choose the word which is least like the others word in a group :"
            }
                    ,{"Complete the series 2,2,5, 13,28,....",
                    " Which number would replace the question mark in series7,12,19,?,39",
                    "Complete the series, 1, 4, 9, 16, 25,....",
                    "Complete the series20, 19, 17, ...., 10, 5",
                    "6, 11, 21, 36, 56, ? what will replace the question mark in the series ?",
                    " Complete the series1,6,13,22,33,..",
                    "Complete the series1,3,6,10,15....",
                    "1,9,17,33,49,73, ?",
                    "2,5,9,?,20,27, what will replace the question mark ?",
                    "21,25,33,49,81, ?",
                    "5,9,17,29,45, ?",
                    "1,6,15,(...),45,66,91",
                    "Look at this series: 22, 21, 23, 22, 24, 23, ... What number should come next?",
                    " What number should come next in the series, 1, 2, 3, 5, 8, ?",
                    "19, 2, 38, 3, 114, 4, ? . Which term should replace the question mark in this series ?",
                    "36, 34, 30, 28, 24, ... What number should come next?",
                    "3, 12, 27, 48, 75, 108,",
                    "2,15,41,80, ? . Complete the series",
                    "8, 10, 14, 18, (...), 34, 50, 66",
                    "1,2,6,24, ?"
            },
                    {
                            " Find The Odd One Out : Iron Box, Mixie, Computer, Gas Stove",
                            " Find The Odd One Out : Tortoise, Crab, Frog, Fish",
                            " Find The Odd One Out : 13, 17, 23, 63, 71",
                            " Find The Odd One Out : (64, 83), (100, 121), (16, 25), (36, 49)",
                            " Find The Odd One Out : (9 - 72), (10 - 90), (8 - 56), (11 - 115)",
                            " Find The Odd One Out : Jeevan Raksha Padak, Param Vir Chakra, Padma Bhusan, Bharat Ratna",
                            " Find The Odd One Out : Milk, Ghee, Paneer, Butter",
                            " Find The Odd One Out : Which word will appear fourth in the dictionary?",
                            " Find The Odd One Out : 7, 8, 12, 20, 37, 62",
                            " Find The Odd One Out : 1, 8, 27, 65, 125, 216",
                            "Select the one which is different from the other three alternatives.",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives",
                            "Select the one which is different from the other three alternatives"
                    },
                    {
                            "Pointing towards Vaman, Madhav said “I am the only son of his father’s one of the sons.”  How Vaman is related to Madhav? ",
                            " Pointing to a photograph, Vipul said, \"She is the daughter of my grandfather's only son.\" How is Vipul related to the girl in the photograph ? ",
                            ". Looking at a portrait of a man, Harsh said, \"His mother is the wife of my father's son. Brothers and sisters I have none.\" At whose portrait was Harsh looking ? ",
                            "Pointing to a girl in the photograph, Amar said, \"Her mother`s brother is the only son of my mother's father.\" How is the girl`s mother related to Amar ?",
                            "A girl introduced a boy as the son of the daughter of the father of her uncle. The boy is girl`s ",
                            "If X is the brother of the son of Y`s son, how is X related to Y ? ",
                            " Pointing to a women in a photograph a man says “She is the daughter-in-law of the mother of my father’s only grand son”. How is he woman related to the man? ",
                            "Pointing to a man in a photograph a woman said, “His brother’s father is the woman related to the man in the photograph? ",
                            "Pointing to a photograph, a woman says, \"This man`s son`s sister is my mother-in-law.\" How is the woman`s husband related to the man in the photograph ? ",
                            "When Anuj saw Manish, he recalled, \"He is the son of the father of my daughter.\" Who is Manish ? ",
                            " Pointing to a photograph, a man said, \"I have no brother or sister but that man's father is my father's son.\" Whose photograph was it ? ",
                            " Pointing to a man, a woman said, \"His mother is the only daughter of my mother.\" How is the woman related to the man ? ",
                            " Pointing towards a person in a photograph, Anusha said, \"He is the only son of the father of my sister's brother.\" How is that person is related to Anjali ? ",
                            "Looking at the portrait of a man, Naveen said, \"His mother is the wife of my father's son. I have no brothersor sisters.\" At whose portrait was Harsh was looking ? ",
                            " Pointing to the photograph, Krishna said, \"She is the daughter of my grandfather's only son.\" How is Krishna related to the girl in the photograph ? ",
                            "A is B’s brother, B is C’s sister and C is D’s father, D is A’s? ",
                            "Q’s mother is sister of P and daughter of M. S is daughter of P and sister of T. How is M Related to T? ",
                            "Pointing of a man, Rohit said, “His son is my son’s uncle”. How the woman is related to the man? ",
                            "A man said to a woman, “your mother’s husband’s sister is my aunt”. How the woman is related to the man? ",
                            "ntroducing a girl in the photograph, Sunil said “Her mother is the only daughter of my mother-in-law”. How is Sunil related to the girl in the photograph?"
                    },
                    {
                            " Which letter will come exactly between the tenth letter from your left and the seventh letter from your right. Without changing any order in the original from the alphabet? ",
                            "If it is possible to from a word with the first, fourth, seventh and eleventh letters in the word 'SPHERVLVODS' write the second letter of thet word. Otherwise, X is the answer.? ",
                            "How many pairs of letters are there in the word 'CASTRAPHONE' which have as many letters between them in the word as in the alphabet? ",
                            "If the letters in the word RUTHENIUM are rearranged in the alphabatical order, which letter will be second to the right of middle letter? ",
                            "How many pairs of letters in the word 'CHAIRS' have as many letters between them in the word as in the alphabet? ",
                            "From the word 'LAPAROSCOPY' how many independent meaningful words can be made without changing the order of the letters and using each letter only once ? ",
                            " A B C D E F G H I J K L M N O P Q R S T U V W X Y Z . Which letter in this alphabet is the eighth letter to the right of the letter and which is tenth letter to the left of the last but one letter of the alphabet? ",
                            "How many pairs of letters are there in the word \" CASTRAPHONE\" which have as many letters between them in the word as in the alphabet? ",
                            " If in the word 'DISTURBANCE', the first letter is interchanged with the last letter, the second letter is interchanged with the tenth letter and so on, which letter would come after the letter T in the newly formed word ? ",
                            " If the following English alphabet, if second half of the alphabet is written in reverse order, which of the letter is 7th right of 16th letter from the left? ",
                            "If 1st & 7th, 2nd & 8th, 3rd & 9th letters are interchanged in the word TRANSLATION. What will be the fifth letter to the right of 9th letter from the right? ",
                            " From the word 'CARRIAGE', how many independent words can be made without changing the order of the letter only once. ",
                            "If the first and second letters in the word 'EXCELLECE' are interchanged, in the sameway third and fourth letters, the fifth and the sixth letters and so on. Which letter would be the sixth when counted from the right? ",
                            "From the word 'POSTSCRIPT', how many independent words can be made without changing the order of the letters and using each letters only once? ",
                            " What should come next in the following letter sequence?A A B A B C A B C D A B C D E A B C D",
                            "S L U A Y J V E I O N Q G Z B D R HWhat will come in place of question (?) mark in the following series?LA UJ YI EG ?",
                            " How many meaningful English words can be formed with the letters ESRO using each letter only once in each word? ",
                            "If the first and second letters in the word DEPRESSION' were interchanged, also the third and the fourth letters, the fifth and the sixth letters and so on, which of the following would be the seventh letter from the right ? ",
                            "From the word 'ASTOUNDER', how many independent words can be made with-out changing the order of the letters and using each letter only once ? ",
                            " If the first and second letters in the word 'MISFORTUNE' were interchanged, also the third and the fourth letters, the fifth and the sixth letters and so on, which letter would then be the eighth letter counting to your left ? ",
                    },
                    {
                            " In a chess tournament each of six players will play every other player exactly once. How many matches will be played during the tournament ?",
                            ". A, B, C and D play a game of cards. A says to B. \"If I give you 8 cards, you will have as many as C has and I shall have 3 less than what C has. Also if I take 8 cards from C, I shall have twice as many as D has.\" If B and D together have 50 cards, how many cards have A got?",
                            "Reena is twice as old as Sunita. Three years ago, she was three times as old as Sunita. How old is Reena now ?",
                            "A shepherd had 27 sheep. All but 10 died. How many he left with ?",
                            "A group of 1200 persons consisting of captains and soldiers is travelling in a train. For every 15 soldiers there is one captain. The number of captains in the group is ?",
                            " Aruna cut a cake into two halves and cuts one half into smaller pieces of equal size. Each of the small pieces is twenty grams in weight. If she has seven pieces of the cake in all with her, how heavy was the original cake ?",
                            "First bunch of bananas has (1/4) again as many bananas as a second bunch. If the second bunch has 3 bananas less than the first bunch, then the number of bananas in the first bunch are",
                            " At the end of a business conference the ten people present all shake hands with each other once. How many handshakes will there be altogether ?",
                            "A student got twice as many sums wrong as he got right. If he attempted 48 sums in all, how many did he solve correctly ?",
                            " The number of boys in a class is three times the number of girls. Which one of the following numbers cannot represent the total number of children in the class ?",
                            "A certain number of horses and an equal number of men are going somewhere. Half of the owners are on their horses' back while the remaining ones are walking along leading their horses. If the number of legs walking on the ground is 70, how many horses are there ?",
                            "If 100 cats kill 100 mice in 100 days, then 4 cats would kill 4 mice in how many days ?",
                            " In a class, there are 18 boys who are over 160 cm tall. If these constitute three-fourths of the boys and the total number of boys is two-thirds of the total number of students in the class, what is the number of girls in the class ?",
                            " I have a few sweets to be distributed. If I keep 2, 3 or 4 in a pack, I am left with one sweet. If I keep 5 in a pack, I am left with none. What is the minimum number of sweets I have to pack and distribute ?",
                            " In a caravan, in addition to 50 hens, there are 45 goats and 8 camels with some keepers. If the total number of feet be 224 more than the number of heads in the caravan, the number of keepers is",
                            "A is three times as old as B. C was twice-as old as A four years ago. In four years' time, A will be 31. What are the present ages of B and C ?",
                            " A father is now three times as old as his son. Five years back, he was four times as old as his son. The age of the son is ",
                            "In a group of 15 people, 7 read French, 8 read English while 3 of them read none of these two. How many of them read French and English both ?",
                            "Find the least number which leaves a reminder of 3 when divided by 5, 6, 7 and 8, but leaves no reminder when divided by 9 ?",
                            "Which number would replace underline mark in the series?2, 5, 10, 17, ---, 37 "
                    }
            };
            ques=que;
        }
        else if(k==3)
        {
            String que[][] = {{"Which of these sounds would you associate with the heart ?",
                    "With Which of these states do Chhattisgarh, Jharkhand and Andhra Pradesh all share their borders",
                    "To respect whose word did the five Pandavas marry Draupadi? ",
                    "Which is the largest banana producing country in the world?",
                    "In 2013, India's Pinki Sonkar flipped the coin for the toss for which of these events? ",
                    "To what post was P Sathasivam appointed in July 2013? ",
                    "Which of these creatures does not have both the male and female reproductive organs in the same body (Hermaphrodites)? ",
                    "Which of these cricketers is credited with the invention of the doosra? ",
                    "Boal, Tengra and Magur are all species of which marine creature? ",
                    "What is the most abundant mineral in the human body? "},
                    {"Who is the 'Bharat Ka Veer Putra Aaccording to the title of a 2013 TV Series ? ",
                            "The first world championship in what sport is planned to be held in 2017, though the game has been played since 1877?",
                            "Which of these is the title of a fantasy novel by Devkinandan Khatri? ",
                            "Who is the first woman amputee in the world to summit Mount Everest ? ",
                            "Which gas is the most reactive of all chemical elements? ",
                            "Which sportsman's 108th birth anniversary was celebrated on 29 Aug 2013 ? ",
                            "Which of these usually eaten hot? ",
                            "What type of naval vehicle is the INS Sindhurakshak? ",
                            "Metal tools and machines are worshipped during which of these festivals?",
                            "Major Dhaynchand Played which Sport? "
                    },
                    {
                            "In 2013, where did the natural calamity known as Himalayan tsunami occur? ",
                            "Which is the largest living species of tortoise in the world, which may weigh about 400 kg? ",
                            "Under a campaign run by UNICEF and Government of India, Aamir Khan has been promoting awareness against which of these ? ",
                            "The tomb of which Governor-General of India is located in Ghazipur in Uttar Pradesh?",
                            "Which of these is a song picturised on Sharmila Tagore from the film 'Amar Prem'?",
                            "Mamnoon Hussain, recently elected president of pakistan, was born in which Indian city? ",
                            "According to the popular song by Shreya Ghosal , who arrives to light 'beedi and chillam' with her 'husn ki teeli'? ",
                            "Which place of worship is located between the Nar and Narayan mountains? ",
                            "Which of these is used as the universal symbol for the fight against HIV/AIDS? ",
                            "Who was bestowed with the 'Rani Laxmibai Stree Shakti Award' by President Mukherjee on International Women's Day in 2013? "
                    },
                    {
                            "Which film is this song from 'TERA RASTA MAI CHODU NA' ? ",
                            "According to legend, which of these Rishis regained his youth by a celestial favor ? ",
                            "Who is the only Indian to have won a medal in Women's Singles at the World Badminton Championships ?",
                            "Put these surnames in the order in which they appear in English telephone Directory A:NEHRU B:BOSE C:PATEL D:GANDHI",
                            "In the human body, what makes the pupil of an eye contract or dilate? ",
                            "What was the code name of the operation by IPKF to take control of Jaffna from the LTTE in 1987 ?",
                            "Which of these is not a type of vitamin? ",
                            "In which city was Vasco Da Gama first buried? ",
                            "Which of these is a popular game? ",
                            "Who among these women has been elected as a Member of Parliament on different occasions on congress and BJP tickets? "
                    },
                    {
                            "In the Ramayana, Which demon impersonated Rama's voice, screaming, 'Lakshman! Help me'? ",
                            "On a restaurant menu, which of these items is often listed as 'Jeera', 'Curd', 'Boiled' or 'Fried'?",
                            "Who has been the longest serving chief minister of Rajasthan?",
                            "Arrange these thing from north to south according to the places mentioned in their names A;Jaipuri Razai B:Mysore PaK C:Amritsari Kulcha D:Kashmiri Embroidery",
                            "NR Narayana Murthy was appointed Executive chairman of IT Giant in 2013? ",
                            "Which of these cities is not named after its founder or a dynasty? ",
                            "The newborn of which of these mammals weighs the heaviest? ",
                            "Starting from the front of a motor car, arrange these parts in correct order A:Steering Wheel B:Backseat C:Headlights D:Dashboard",
                            "'Mona Darling', played by Bindu and Mahie Gill in films , was an associate of which villain? ",
                            "Which is the coldest place in India? "
                    },
                    {
                            "Who is the only leader to be elected Prime Minister of Pakistan three times ? ",
                            "Which of these is a term for a place where people gather for shayari and ghazals ? ",
                            "From which country did India buy an aircraft carrier which was renamed as INS Vikramaditya? ",
                            "Select Countries with Biggest Area in Descending order A:Canada B:China C:USA D:Russia ",
                            "What is the name of India's first ever indigenous aircraft carrier launched in August 2013? ",
                            "Who is the youngest person ever to win a Nobel Prize ? ",
                            "Which of these parties broke away from the NDA in June 2013, after a 17-year long alliance? ",
                            "Select most Populus Country In Order A:China B:USA C:India D:Indonesia",
                            "Which of these is a type of Visa that allows free movement across most European countries? ",
                            "According to a Hindi Song, which of these is yamla Pagla Deewana? "
                    },
                    {
                            "The black widow, which eats the male counterpart after mating, as a female species of which animal ? ",
                            "Which of these is not a recommended mineral in the human diet ? ",
                            "Which of these freedom fighters was the English language secretary to Mahatma Gandhi for 16 years? ",
                            "Which of these is a piece of the game called as chess: ",
                            "BP Mandal, who chaired the second backward classes commission, also known as Mandal commission, served as chief minister of which state? ",
                            "Whom did Lalu Prasad Yadav replace as the Chief Minister of Bihar in 1990? ",
                            "Which one of these states is the largest in area? ",
                            "Arrange these states in the increasing order of members they send to the Lok Sabha A:UP B:Maharashtra C:Sikkim D:Uttarakhand",
                            "Reita Faria, Diana Hayden and Yukta Mookhey have all won which of these titles? ",
                            " With respect to jobs, what does 'padonnati' denote? "
                    },
                    {
                            "Douglas Engelbert, who passed away in 2013, is credited as the inventor of which of these products ? ",
                            "Who or what is the 'baby' in this recent newspaper headline: 'At 66, Mother India gets ready for her 29th baby'? ",
                            "Which of these dishes are usually 'tari ya ras waali' and 'sukhi' ? ",
                            "In the Ramayana, who reminded kaikeyi about the two boons given to her by Dasharatha ?",
                            "Who is the author of the poem 'Where the mind is without fear'? ",
                            " According to Abhigyana Shakuntlam, as result of which Rishi's curse did king Dushyant forget Shakuntla? ",
                            "Which of these sportsmen has not yet won the Rajiv Gandhi Khel Ratna Award? ",
                            "In the title of a 2013 Hindi film, which of these characters is told to run? ",
                            "Which football club won the English Premier League in 2012 after a gap of 44 years? ",
                            "Who is the director of National Film Award winning films 'Chokher bali' in Bengali, 'Raincoat' in Hindi and ' The Last Lear' in English? "
                    },
                    {
                            "In 1850, the first experimental electric telegraph line in India was set up between Calcutta and which place ? ",
                            "Who was the president of India at the turn of the century, as the 20th century became the 21st century ?",
                            "The end of what service is referred to in this newspaper headline : 'Dot, dash, full stop : ______________ service ends July 15 ' ? ",
                            " Which of these words means 'water'? ",
                            "To reach which of these places do pilgrims start their journey on foot from Gauri Kund? ",
                            " Who is the first batsman to score a century in all these formats of international cricket-Test, ODI and T20. ",
                            "Which poem are these lines from: 'Nari tum keval Shraddha ho, Vishwas-rajat-nag- pagtal mein, Piyush-srot-si baha karo, Jivan ke sunder samtal hein'? ",
                            "Which of these Indian cricketers are brothers? ",
                            "Which of these garments if named an atoll in the Marshall islands? ",
                            "According to the Ramayana, Whom did Raja Bhagirath request to reduce the flow of Ganga when she arrives on earth? "
                    },
                    {
                            "Which of these persons has not walked on the Moon ? ",
                            "The 2013 film 'Lootera' is partly based on which short story by O'Henry ? ",
                            "Which of these festivals is also known as 'Khichdi Parv' in northern India? ",
                            "What Social Compaign was launched by Farhan Akhtar in 2013 against rape and discrimination of women? ",
                            "Which of these sportsmen started his carrier as a travelling ticket examiner with Indian railways? ",
                            "Which of these is is a kind of a mobile phone?",
                            "Which is the only country, apart from India, where one can find the Indian rhinoceros in its natural Habitat? ",
                            "What is the name of the dancing form of Lord Shiva that gained prominence in India during the Chola period? ",
                            "Mother of the late Mansoor Ali Khan Pataudi was the Begum of which princely state of India? ",
                            "Which of these films was inspired by the fake CBI raids in the 1980s?"
                    },
                    {
                            "Who was the chairman of the Indian Calendar Reform Committee that initiated the adoption of Saka calendar as the Indian national Calendar ? ",
                            "Which flower goes before 'Gang' to make the title of Madhuri-Juhi film ?",
                            "To which of these Sufi saints is this song dedicated. OH Laal Pat meri ab ",
                            "In the Mughal era, which of these harbours was also known as 'Babul Mecca' and 'Meccaidwar'? ",
                            "Where was Durga Shakti Nagpal, IAS, serving when she was suspended by the UP Govt? ",
                            "A Batsman is most likely to be called 'out of form' because of which of the following?",
                            "In the movie, 'Athithi tum kab jaoge', who played the role of a guest. ",
                            "Complete this popular saying 'Daane Daane par likha hai _________'? ",
                            "In which district of Chhattisgarh did Maoists attack a convoy of Congress leaders on 25 May 2013? ",
                            "What surname do the businessmen Ghanshyam Das, Krishna Kumari Basant Kumar, Aditya Vikram and Kumar Mangalam share? "
                    },
                    {
                            "'The Phrase 100 crore Club', often mentioned in Indian media nowadays, refers to which one of the following ? ",
                            "In boxing, what are jab,cross and hook types of ?",
                            "In Which of these regions would you find the town of Kishtwar ? ",
                            "After whom is the annual award, given by the Govt of India to an outstanding handloom weaver, named ?",
                            "Which of these cricket tournaments is often referred to as the 'Mini World Cup' ? ",
                            "The increased level of which of these causes more humidity in the air? ",
                            "From top to bottom arrange these according to the parts of the body on which they are generally worn. A) Ghagra, B) Ghunghat C) Ghungroo, D) Ghadi. ",
                            "In geometry, if a shape has only three sides namely A, B and C, then what shape would that be? ",
                            "Which vitamin helps with blood clotting? ",
                            "According to Guinness World Records, what is the largest Carnivore on land? "
                    }
            };

            ques=que;
        }
















    }
    public void getAnswer(int k)
    {


        if(k==1)
        {
            String an[][][]= {
                    {
                            {"Tea is made by Sahil sharma.","Tea is made by the Sahil sharma.","Tea was made by Sahil sharma.","Tea has made by Sahil sharma.","1"},
                            {"I loved my father.","I was loved by my father.","I were loved by my father.","I am loved by my father.","4"},
                            { "He has hated by us.","He is hated by us.","He was hated by us.","He will hated by us.","2"},
                            {"I am not like by Savita.","I am not liked by Savita.","I was not liked by Savita.","I were not liked by Savita.","2"},
                            { "A film is made by him.","A film had being made by him."," A film is being made by him."," A film has being made by him.","3"},
                            { "A song has been being sung by Shivu."," A song is sung by Shivu."," A song has being sung by Shivu."," A song is being sung by Shivu.","4"},
                            { "The match is watched by my friends.","The match had being watched by my friends."," The match is being watched by my friends."," The match has being watched by my friends.","3"},
                            {"Food is being cooked by my mother."," Food has been cooked by my mother."," Food was being cooked by my mother.","Food is being cook by my mother.","1"},
                            { "The game has not being played by them.","The game is not being played by them."," The game is being not played by them."," The game has being not played by them.","2"},
                            {"This matter have been solved by my father."," This matter is solved by my father."," This matter has been solved by my father."," This matter had been solved by my father.","3"},
                            { "These notes are written by Priyanka.","These notes has been written by Priyanka."," These notes have been written by Priyanka."," These notes had been written by Priyanka.","3"},
                            {"His book is been stolen."," His book has been stolen."," His book is stolen."," His book has stolen.","2"},
                            { "A perfume have been given to him by me."," A perfume has been given to him by me."," A perfume had been given to him by me."," A perfume was given to him by me.","2"},
                            {"That watch was stolen by him."," That watch stolen by him."," That watch stole by him."," That watch had stolen by him.","1"},
                            { "The lie was spoke by Sahil.","The lie spoken by Sahil."," Lie was spoken by Sahil."," The lie was spoken by Sahil.","4"},
                            {"He was kill by the thief."," He killed by the thief.","He was killed by the thief.","He was killed","3"},
                            {"The culprit were caught be the police.","The culprit was caught be the police.","The culprit caught be the police."," The culprit had caught be the police.","2"},
                            { "A love letter had being written by him."," A love letter being written by him."," A love letter was written by him."," A love letter was being written by him.","4"},
                            {"The fields was being ploughed by the farmer."," The fields were being ploughed by the farmer."," The fields were ploughed by the farmer."," The fields were being ploughed by farmer.","2"},
                            { "The Gita was being read by Sita.","The Gita were being read by Sita.","Gita was being read by Sita."," The Gita was read by Sita.","1"}

                    },
                    {
                            {"Their tasks had not been done.","Their tasks had been not done.","Their tasks have not been done.","Their tasks have been not done.","1"},
                            {" He have been already adopted."," He had already been adopted.","He had already adopted."," He has been already adopted.","2"},
                            {"The message will passed by Rahul."," The message would be passed by Rahul.","The message will pass by Rahul."," The message will be passed by Rahul.","4"},
                            {"I would be hated by him.","I will be hated by him.","I will hated by him.","I will be hate by him.","2"},
                            {"The culprit will have caught by the police.","The culprit have been caught by the police."," The culprit will have been caught by the police.","The culprit would have been caught by the police.","3"},
                            {" The door would have closed by Sunder.","The door would have been closed by Sunder."," The door will have been closed by Sunder.","The door will have closed by Sunder.","3"},
                            {" He must helped by me.","I must held him."," He must get help from me.","He must be helped by me.","4"},
                            {" French can spoken by him."," French can be spoke by him.","French can be spoken by him.","French could be spoken by him.","3"},
                            {" The battle may be win.","The battle may be won.","The battle may be won by them.","The battle may won.","2"},
                            {"He can not be caught."," He can not caught."," He could not be cought.","He could not cought.","1"},
                            {"Our teachers might have obeyed.","Our teachers might have been obeyed.","Our teachers must have been obeyed."," Our teachers must have obeyed.","3"},
                            {" That task must had been done by Rahul.","That task must have been done by Rahul.","That task must have done by Rahul.","That task must have been did by Rahul.","2"},
                            {"Our environment ought to had been saved.","Our environment ought to have been save.","Our environment ought to have been saved.","Our environment ought to have saved.","3"},
                            {" To be read there is no book.","To read there is no book.","There is no book to read.","There is no book to be read.","4"},
                            {"There was nothing to be done.","There is nothing to be done.","There is nothing to done.","There is no thing to do.","2"},
                            {" It is time to prepared for the game trails.","It is time to be prepared for the game trails.","It is time for the game trails to prepared.","It is time for the game trails to be prepared.","4"},
                            {" It is time to be learnt English."," It is time for English to be learnt.","It is time for English to learnt."," It is time to be learn English.","2"},
                            {" It is time for our business to be done.","It is time to our business to be done.","It is time our business to be done.","It is time for our business be done.","1"},
                            {" He like respect."," He likes to be respected."," He like to be respected."," He want to be respected.","3"},
                            {" It has to be saw or to be believe by Rahul.","It has to be seen or to believe by Rahul."," It has to be seen or to be believe by Rahul."," It has to be seen or to be believe by Rahul.","3"}
                    }
                    ,
                    {
                            {"Let cooler be switch on.","Switch on the cooler please.","Let cooler be switched on.","Let the cooler be switched on.","4"},
                            {"Let a bottle of juice be brought.","Let bottle of juice be brought.","Let a bottle of juice brought.","Let a bottle of juice be bring.","1"},
                            {" Let the deaf man not be insult."," Let the deaf man not be insulted.","Let the deaf man not insulted."," Let deaf man not be insulted.","2"},
                            {"Let the fence not be touch."," Let the fence not be touched."," Let the fence not touched."," Let the fence to not be touched.","2"},
                            {" The poor should helped.","We should help poor."," Let the poor be helped."," The poor should be helped.","4"},
                            {"Your neighbours should respected."," Your neighbours should be respected."," Let neighbours be respected."," Let neighbours respected.","2"},
                            {"You are ordered to give me a pen."," You are ought to give me a pen."," You are requested to give me pen."," You are requested to give me a pen.","4"},
                            {" You are requested to tell me something.","You are requested tell me something.","You are requested to tell something.","You are request to tell me something.","1"},
                            {" Let this task be did be me.","Let this task done be me.","Let this task be done be me.","Let this task be do be me.","3"},
                            {" This work let done by him.","Let this task done be me.","This work let be done by him.","Let this work be done by him.","4"},
                            {"It is suggested that we could play.","It is suggested that we should play.","It is suggested to play.","No change","2"},
                            {"It is suggested, we should sing.","It is suggested to sing.","It is suggested that we could sing.","It is suggested that we should sing.","4"},
                            {"You are requested to sit down.","You are ordered to site down."," You are told to sit down."," No change.","2"},
                            {" Was a car bought by him."," Did car bought by him."," Did a car bought by him."," Were a car bought by him.","1"},
                            {" Will the Sheetal not be helped ?"," Will the Sheetal not helped ?"," Will the Sheetal not be help ?"," Will Sheetal not be helped ?","1"},
                            {"Why he beaten his brother ?"," Why his brother beaten by him ?"," Why is his brother beat by him ?","Why is his brother beaten by him ?","4"},
                            {" Where did the utensils bought ?","Where was the utensils bought ?"," Where are the utensils bought ?","Where were the utensils bought ?","3"},
                            {"By who were you taught English.","By which were you taught English.","By whom you were taught English ?","By whom were you taught English ?","4"},
                            {"By whom is this book written ?","By whom was this book written ?","By who was this book written ?","By whom were this book written ?","2"},
                            {" By whom has been this noble written ?","By whom had this noble written ?","By whom was this noble written ?","By whom this noble was written ?","3"}
                    },
                    {
                            {" Perplexed","Clear Up","Explain","Enlighten","1"},
                            {"To take revenge","Matter of shame"," Complete knowledge"," None of above","3"},
                            {" Difficult Moment","Without Delay"," Great Moment"," Very Slow","2"},
                            {" Every person","Particular thing same in all","Call all at once"," Most important","4"},
                            {" close examinations"," live near to each other","live far to each other"," in love","1"},
                            {"In random order"," Related to fruits packing"," Related to dry fruit packing","In perfect order","4"},
                            {" boasting person","honest and straightforward"," a man with arrogance"," a dishonest person","2"},
                            {"Very weak"," Recovering from illness"," Looks fit but not fit actaully"," None of above","4"},
                            {"In difficulty","to be at strife","very happy together","None of above","2"},
                            {" cause of wealth"," cause of illness","cause of happiness","cause of quarrel","4"},
                            {"at a business loss","at a relation loss","to be unable to decide"," none of above","","3"},
                            {" to have bitter enmity","to be very friendly"," to be unknown"," to be very familiar","1"},
                            {" very famous","not famous","abscond"," very far","3"},
                            {" baffled","very happy","very excited","very sad","1"},
                            {" More for your money","Not for money","More for your nature","More for your smile","1"},
                            {"in perfect order","very happy","in disorder","very sad","3"},
                            {"Doubtful"," Very Confident","Very Calm","Careful","4"},
                            {" Good news"," Very famous"," Rubbish"," None of above","3"},
                            {"accept deal in a pressure"," accept deal without knowing","accept deal after detail analysis"," accept deal due to threat","2"},
                            {"After lots of thinking"," In a single action"," By mistake","Joint action","2"}
                    }
                    ,
                    {
                            {"An ideal place for holidays"," A place with certain memories"," A religious place"," A lonely forsaken place","4"},
                            {"by permission"," by any means"," by noble means","by request","2"},
                            {" to argue"," to request"," to give respect"," to be polite","1"},
                            {"To do something with courage"," To win a prize"," To speak first after long silence"," To win some one heart","3"},
                            {" Wounded in scuffle","Bitter relations","Dishonest","Arrogant","2"},
                            {" To put things in order"," To put things in disorder","To trust someone","To beat very badly","4"},
                            {"to bully"," to respect"," to praise","to rebuke","1"},
                            {" to obey"," to ignore"," to follow"," none of above","2"},
                            {"To praise other","To praise leader"," To praise ownself"," To praise community","3"},
                            {" to break peace"," joint operation of killing"," to make peace"," none of above","3"},
                            {" To punish"," To serve"," To praise","To write a story","1"},
                            {"To stop a movement","To join a movement"," To protect a movement"," To start a movement","4"},
                            {"Continue support","Support that failed","Support endlessly","None of above","2"},
                            {" By force of","By permission of","By fear of"," By blessing of","1"},
                            {"Very rapid","Very weak"," Stiffness"," Boldness","3"},
                            {"To be ready to go"," To be very active","To do things in reverse order","To do things in right order","3"},
                            {" Different from each other","Having same properties","Having fun together","Making plans","1"},
                            {" To wish for something impossible","To wish for something accessible","To try to have something by bad means","None of above","1"},
                            {" To have great fun","To do something wrong","To win a victory","To loose something","3"},
                            {" the evil intension"," the nice intension"," to do something religious"," to help someone silently","1"}
                    },
                    {
                            {" He told to me that he is ready."," He told me that he was ready.","He told me that I am ready."," He told me that I will ready.","2"},
                            {"Sonia said that I helps her sister.","Sonia said to me that I helped her sister.","Sonia said that I helped her sister.","Sonia says that I helped her sister.","3"},
                            {"They said that we can not live without oxygen.","They said that they can not live without oxygen."," They said that they would not live without oxygen."," They says that they can not live without oxygen.","1"},
                            {" Rahul said to me that we are mortal.","Rahul says to me that we are mortal."," Rahul said to me that we all are mortal."," Rahul said to me that he and I are mortal.","1"},
                            {"The Indian express says that it will issue a astrology section in their Thursday's paper."," The Indian express says that they will issue a astrology section in their Thursday's paper."," The Indian express said that it will issue a astrology section in its Thursday's paper.","The Indian express says that it will issue a astrology section in its Thursday's paper.","4"},
                            {" John said that he went there."," John says that he will go there."," John says that he went there."," John said that I will go there.","2"},
                            {"Robert will tell me that he is my classmate."," Robert will tell me that he was my classmate."," Robert will tell me that he will be my classmate."," Robert said me that he is my classmate.","1"},
                            {" Sushant told him that he has helped his son for years."," Sushant told him that he have been helping his son for years."," Sushant told him that he had been helping his son for years."," Sushant told him that he has been helping his son for years.","3"},
                            {" He said to me that he will be writing an essay."," He told me that he would write an essay.","He said to me that he will write an essay.","He told me that he would write an essay.","4"},
                            {" He told me that he would have been writing an essay.","He told me that he would be writing an essay."," He told me that he will be writing an essay."," He told me that he shall be writing an essay.","2"},
                            {" Sita told Geeta that she can be learn piano."," Sita told Geeta that you can learn piano."," Sita told Geeta that she could learn piano."," Sita told Geeta that she can learn piano.","3"},
                            {"He told you that you might be go out."," He said you that you might be go out."," He told you that you may go out."," He told you that you might go out.","4"},
                            {" Ram told Rahul that he was a good player of cricket.","Ram told Rahul that he were a good player of cricket.","Ram told Rahul that he would a good player of cricket.","Ram told Rahul that he could be a good player of cricket.","1"},
                            {" Shahekant said that he had no time for me."," Shahekant told me that he had no time for me."," Shahekant told me that he has no time for me."," Shahekant told me that he was having no time for me.","2"},
                            {" Sahil told Deepu that he were going to buy milk."," Sahil told Deepu that he would going to buy milk.","Sahil told Deepu that he had been going to buy milk.","Sahil told Deepu that he was going to buy milk.","3"},
                            {"She told me that I had been missing from the picnic.","She told me that I has been missing from the picnic",".She told me that I were missing from the picnic."," She told me that I had been missed from the picnic.","1"},
                            {" Reeta told Shivani that she would have to go to school."," Reeta told Shivani that she has to go to school."," Reeta told Shivani that she have to go to school."," Reeta told Shivani that she had to go to school.","4"},
                            {"You told her that she has to cook food for you."," You told her that she had to cook food for you.","You told her that she needs to cook food for you.","You told her that she would have to cook food for you.","2"},
                            {" He told me that he has to finish this first.","He told me that he have to finish this first.","He told me that he had had to finish this first.","He told me that he had to finish this first.","3"},
                            {"Rahul told Susheela that he has to reach there.","Rahul told Susheela that he would have to reach there.","Rahul told Susheela that he had to reach there."," Rahul told Susheela that he had had to reach there.","4"}
                    },
                    {
                            {" Reema told to Jitender that he has not to fight with her.","Reema told to Jitender that he would not fight with her."," Reema told to Jitender that he will not fight with her.","Reema told to Jitender that he should not fight with her.","2"},
                            {" My father told me that it may have rain the previous day."," My father told me that it would rain the previous day.","My father told me that it might rain the previous day.","My father told me that it could rain the previous day.","3"},
                            {" He told that he had gone to Rajesthan the day before.","He told that he has gone to Rajesthan the day before."," He told that he has went to Rajesthan the day before."," He told that he had went to Rajesthan the day before.","1"},
                            {" Raju told me that he had worked hard.","Raju told me that he has worked hard.","Raju told me that he had been worked hard.","Raju told me that he has been worked hard.","1"},
                            {" Rahul said that he had been walking."," Rahul said that he was walking."," Rahul said that he had walking."," Rahul said that he had walked.","1"},
                            {"Sheela told me that Munni have been dancing better than her.","Sheela told me that Munni was dancing better than her.","Sheela told me that Munni had been dancing better than her.","Sheela told me that Munni had dancing better than her.","3"},
                            {"She said that he tried to help her.","She said that he had been trying to help her."," She said that he has been trying to help her.","She said that he was trying to help her.","2"},
                            {" Deepak told me that he had finished the coffee.","Deepak told me that he had been finished the coffee.","Deepak told me that he had finish the coffee."," Deepak told me that he finished the coffee.","1"},
                            {" Rahul told me that he have went through it.","Rahul told me that he have gone through it.","Rahul told me that he had went through it.","Rahul told me that he had gone through it.","4"},
                            {"Baljinder told me that he had been working on it for 5 days.","Baljinder told me that he has been working on it for 5 days.","Baljinder told me that he had worked on it for 5 days.","Baljinder told me that he was working on it for 5 days.","1"},
                            {"Sweety told me that she has been writing an essay for 3 hours."," Sweety told me that she had been writing an essay for 3 hours.","Sweety told me that she was writing an essay for 3 hours.","Sweety told me that she had written an essay for 3 hours.","2"},
                            {" Rahul said that he can buy that watch."," Rahul said that he could buy that watch.","Rahul said that he was able to buy that watch.","Rahul said that he can be buy that watch.","2"},
                            {" He said that Honesty is the best policy."," He said that Honesty was the best policy."," He said that Honesty would be the best policy.","He said that Honesty will be the best policy.","1"},
                            {"He remarked that two and two would make four.","He remarked that two and two made four.","He remarked that two and two makes four.","He advised that two and two makes four.","3"},
                            {" My father said that all that glitters was not gold."," My father advised that all that glitters is not gold."," My father remarked that all that glitters is not gold."," My father said that all that glitters is not gold.","4"},
                            {"Rahul remarked that we must obey our parents."," Rahul advised that we must obey our parents."," Rahul said that we must obey our parents."," Rahul said that we should obey our parents.","3"},
                            {" Sheela said that she had to go."," Sheela said that I must go."," Sheela said that she need to go."," Sheela said that she must went.","1"},
                            {" Rakhi tells him that he has to come come back home in time.","Rakhi tells him that he had to come come back home in time."," Rakhi tells him that he will have to come come back home in time.","Rakhi tells him that he must come come back home in time.","1"},
                            {" The MLA said that people your vote will my real power."," The MLA addressed the people as ladies and gentlemen and said that your vote will be my real power.","The MLA addressed the people as ladies and gentlemen and said that their vote is my real power.","The MLA addressed the people as ladies and gentlemen and said that their vote was his real power.","4"},
                            {" She told Rahul that you had done this work.","She told Rahul that you had done that work.","She told Rahul that he had done that work.","She told Rahul that he has done that work.","3"}
                    },
                    {
                            {" Abbreviate"," Abreviate"," Abrrviate"," Abbreviat","1"},
                            {" Aceelerate"," Acelerate"," Accelerate"," Acellrate","3"},
                            {"Accesary"," Acessarry"," Acessary"," Accessary","4"},
                            {"Accoomodate","Accommodate","Accomodate","Acommodate","2"},
                            {"Acoompany","Accompany","Acommpany","Acompany","2"},
                            {" Accountancy","Acountancy","Acoountancy","Acounttancy","1"},
                            {" Acquainttance","Acqquaintance","Accquaintance","Acquaintance","4"},
                            {" Admittance","Admitance","Addmitance","Admitannce","1"},
                            {" Aeroddrome","Aerodrome"," Arodrome"," Aerodromee","2"},
                            {"Aesthettics"," Aesthtics"," Asthetics"," Aesthetics","4"},
                            {" Affectionatte"," Affecttionate"," Afectionate"," Affectionate","4"},
                            {" Archiology","Archaeology","Archeaology","Archealogy","2"},
                            {" Assassenation","Assassination","Assasination","Asassination","2"},
                            {" Autonomouse","Autonomous","Autonomes","Autonomus","2"},
                            {" Admissible"," Admisible","Admissiblle","Addmissible","1"},
                            {"Adoliscence","Adolesence","Adolscence","Adolescence","4"},
                            {"Agravtion","Agraavation","Aggravation","Agravation","3"},
                            {"Aligiance","Allegiance","Alegiance","Aligeance","2"},
                            {" Ammalgamation","Amalgamation","Amallgamation","Amalgamattion","2"},
                            {"Anihelation"," Annihillation"," Annihilation","Anihilation","3"}
                    },
                    {
                            {" Barbarien"," Barberien","Barberian","Barbarian","4"},
                            {" Battallion","Bettalion","Battalion"," Battalean","3"},
                            {"Bibliography"," Bebliography"," Bebeography"," Bibeographe","1"},
                            {" Brethren"," Brrethren"," Brethran"," Brathren","1"},
                            {" Bibliophilae"," Bibliophile"," Bebliophile","Bibleophile","2"},
                            {"Campaegn"," Cammpaign"," Caampaign"," Campaign","4"},
                            {" Cannibale"," Cannible"," Cannibal"," Cannebal","3"},
                            {" Cassettee","Cassette","Cassatte","Cassete","2"},
                            {" Caterpillar"," Catrepillar","Caterpilar","Catirpillar","1"},
                            {" Cavalrie"," Cavalry"," Cavelry"," Cavalre","2"},
                            {"Centigrede","Centegrade","Centigrate","Centigrade","4"},
                            {" Idelism","Idealism","Idaelism","Idealesm","2"},
                            {"Ignorence","Ignnorance","Ignorancce"," Ignorance","4"},
                            {" Influenza","Influanza"," Inflluenza"," Influenga","1"},
                            {"Ignouminious","Ignomenious","Ignominious"," Ignomineous","3"},
                            {" Immediately"," Imediately"," Immediatly"," Immedeately","1"},
                            {"Incessaently","Incissantly","Incesantly","Incessantly","4"},
                            {" Incipiente","Incipient","Incipiant"," Incepient","2"},
                            {" Inconvenience","Inconveneence","Incanvenience","Inconvinience","1"},
                            {"Inequitous","Iniquitoes","Iniquitous","Iniquetous","3"}
                    },
                    {
                            {"Rahul is Often coming"," to me"," on Sundays","No Error","1"},
                            {" Sheela just completed","the letter","then","No error","1"},
                            {" It came to","my notice","lately","No Error","1"},
                            {" If you had seen","yesterday's cricket I am sure you","would have enjoyed seeing our team bat","No Error","4"},
                            {"I enquired of him","why he is so negligent","in his studies","No Error","2"},
                            {"As the meeting"," was about to end"," several questions","3"},
                            {"The ship"," was"," loaded"," with cotton","3"},
                            {"When Hanish will come"," I will","make sure","I meet him","1"},
                            {" The traveller being weary","he sat by","wood-side to rest","No Error","2"},
                            {" It is high time","that"," we leave"," this place","3"},
                            {"I am disappointed in","not having saw any place","while I was in","Delhi on vacation","2"},
                            {" Now-a-days he","along with his friends go"," for a ride"," every evening","2"},
                            {" Shikha treated"," Akshay not even","to cocktails","but also to dinner","2"},
                            {"Him not agreeing","to accept the","proposals outlined","by the committee in baffling","1"},
                            {"An Indian ship","laden with merchandise","got drowned","in the Pacific Ocean","3"},
                            {"The students were","awaiting for","the arrival","of the chief guest","2"},
                            {" The minister's speech"," has been reported","to the newspaper","No error","3"},
                            {"The gentleman"," together with his wife","and children were"," there.","3"},
                            {" Hardly had","I left the house"," than it began","to rain.","3"},
                            {" Entering the crowded store","I saw","two vaguely familiar faces."," No Error","4"}
                    },
                    {
                            {" Had the function","not been postponed","because of the strike","she may have been able to participate.","4"},
                            {" The reason why","he was late was","because he had been","caught in rain.","3"},
                            {" I did not practise","music since","I was twenty four","No error","1"},
                            {" The number of students","appearing at the written examination"," increases every year."," No Error","4"},
                            {" Being a destitute"," I admitted him","  people's home.","1"},
                            {" He was reading","very hard for","six months","still he failed.","1"},
                            {"Imagine a place","which lacks not only phased growth","but is burdened with","loots and crimes","3"},
                            {"We always complain that prices","are too high and that we were","not getting our money's worth.","No Error","2"},
                            {"Even after requesting Ramesh"," he did not tell us"," that how he"," solved the problem.","3"},
                            {" The reason for the bus being late","  was involved"," in an accident.","2"},
                            {" In order to save petrol","motorists must have to","be very cautious","while driving along the highways.","2"},
                            {" Despite of","his repeated requests","the teacher","beat him for his mistake.","2"},
                            {"Consider his young age","the achievement of the player","is really admirable.","No Error","1"},
                            {" Neither of the plans","suits him and therefore","he decided not to","go out yesterday.","2"},
                            {" Neetu deserves to be"," rewarded by her successful","completion of the entire work","in such a short time.","2"},
                            {"The recent survey has","indicated that there is","perceptible change in"," climate due to global warming.","3"},
                            {"Seema did not like","leaving her brother alone in the house","but she had no alternative","as she has to go out to work.","4"},
                            {"The apparently obvious solutions","to most of her problems","were overlook by","many of her friends.","3"},
                            {" Developmental activities of","the government come","to a standstill due","to paucity of funds.","2"},
                            {" I was surprised at not having"," seen her even though","she was standing in front of me.","No Error","4"}
                    }
                    ,{
                    {"Try","Join"," Keep with","Forsake","4"},
                    {"Join"," Search","Abandon","Advance","3"},
                    {"Division","Complete","Small","Half","2"},
                    {"Refrain","Ingest","Take in","Consume","1"},
                    {" Confer","Refusal"," Dissension","Opposition","1"},
                    {"Withhold","Conceal","Familiarise","Risky","3"},
                    {" Decline","Acquire","Excited","Irritate","4"},
                    {" Progressive","Selfish","Benevolent","Inhumane","3"},
                    {"Enmity","Affection","Love","Good will","1"},
                    {"Caring"," Concerned","Refusing","Emotionless","4"},
                    {" Conceited","Humble","Progressive","Noble","1"},
                    {" Victim","Slayer","Record"," Heroic","2"},
                    {"Rejection","Diligent","Indolent"," Careless","2"},
                    {" Dislike","Insolence","Boasting","Agree","2"},
                    {" Mollify","Swiftness","Laziness","Lethargy","2"},
                    {"Dislke"," Charity","  Reprove","1"},
                    {" Enmity","Courtesy","Scarce","Discord","1"},
                    {" Pull out","Dislike"," Embarass"," Hearten","3"},
                    {" Haste"," Inept"," Clumsy"," Skilful","4"},
                    {" Highwayman"," In prison"," Free person"," Boasting","1"}

            }};
            ans=an;
        }
        else if(k==2)
        {
            String an[][][]={
                    {
                            {"Employer"," Leader"," Worker","Manager","2"},
                            {" Sun","Planet","Solar System"," Asteroid","2"},
                            {"Compulsion"," Panic"," Provocation"," Force","3"},
                            {"Heat"," Radiation"," Energy"," Temperature","4"},
                            {" BUSH","  FOREST"," BEAK","4"},
                            {" Stable"," Cart"," Saddle"," Engine","2"},
                            {" Twig","Seed"," Taste"," Flower","2"},
                            {" Rain"," Stream"," Pool"," Canal","3"},
                            {" Lamb"," Horse"," Elephant"," Lion","2"},
                            {" Port"," Depot","Hangar","Harbour","3"},
                            {"Glorify","Homage"," Compliment"," Recommend","1"},
                            {"Reveal","Extol","Recognise","Caluminate","2"},
                            {" Rome"," Mexico"," Canada"," Australia","1"},
                            {" Rain","Bridge","Dam","River","3"},
                            {" River","Canal","Glacier","Avalanche","1"},
                            {" Cow","Snake","Fish","Sparrow","1"},
                            {" Flame"," Debris"," Sound"," Death","2"},
                            {"Net","Tournament","Racket","Court","4"},
                            {" Canvas","Pen","Verse","Chisel","3"},
                            {"Wound","Sword","Weapon","Death","3"}
                    },
                    {
                            {" Field","Stick"," Player"," Ball","2"},
                            {" Adequacy","Surplus"," Competency","Import","2"},
                            {"Language","Sentence","Meaning","Education","1"},
                            {" Rhythmic","Monotonous"," Decorous"," Obsolete","2"},
                            {" Forest"," Land"," Mountain","Desert","4"},
                            {" Tortuous","Circumlocutory","Straight","Curved","2"},
                            {" Heel","Fingures","Foot","Knee","4"},
                            {" Red"," Voilet","Blue","1"},
                            {" Nadir"," Bottom","Fall","Height","1"},
                            {" Governement","State","Nation","Cabinet","3"},
                            {" Reels","Recordings","Files","Floppy","4"},
                            {"Match","Correct","Oppose"," Contradict","1"},
                            {"Fishes"," Whales"," Oysters"," Mammals","1"},
                            {" Novelist","Poet"," Essayist"," Composer","4"},
                            {"Invitation","Valediction","Repetition","Organisation","2"},
                            {"Earthquake","Flood","Emergency","Steam","2"},
                            {" Income","Knowledge","Service","Business","2"},
                            {" Chemistry","Medicine"," Palaeontology","Mechanics","2"},
                            {" Messenger","Theif","Pickpocket"," Robber","1"},
                            {" Break","Push","Scoop","Whittle","3"}
                    },
                    {
                            {" Treatment","Disease"," Unrest"," Sleeplessness","4"},
                            {" Ghee","Drink","Curd","Protein","3"},
                            {" Papers","Truth","Documents","Acceptance","2"},
                            {"Sad","Despair","Pain","Cry","2"},
                            {" Change","Chaos","Peace","Reformation","3"},
                            {" Bland","Salty","Pleasant","Small","1"},
                            {"Crime","Guilt","Allegation","Punishment","4"},
                            {" Animal","Horse","Spider","Rat","3"},
                            {" Rupee","Money","Coin","Wealth","1"},
                            {" Tyre","Car","Road","Hub","4"},
                            {"Hospital","Body","Disease","Medicine","3"},
                            {" South-West","East","North-East","South","3"},
                            {" Wish","Hate","Suppress","Indifference","2"},
                            {"Chain","Pedal","Road","Wheel","2"},
                            {" Weigh","Measures","Calculate","Count","4"},
                            {" Leave","Permit","Agency","Policy","4"},
                            {" Rubber","Hot air","Rope","Nylon","2"},
                            {" Disaster","Precaution","Risk","Danger","4"},
                            {" Type : Paint","Table : Chair","Ink : Paper","Door : Handle","3"},
                            {"Programme : Function","Performance : Ticket","Map : Scale","Footnote : Article","1"}
                    },
                    {
                            {"Dirty : Filthy"," Disorderly : Unfaithful"," Raise : Commensurate"," Promoted : Excellence","1"},
                            {"Shark : School"," Whale : Herd"," Elephant : Flock"," Audience : Theatre","1"},
                            {" Aeroplane : Aerodrome"," Roots : Tree"," Blood : Veins"," Car : Garage","3"},
                            {" Devotion : Blessing"," Excitement : Frenzy"," Sleep : Dream"," Fever : Malaria","2"},
                            {"Aeroplane : Aerodrome","Quay : Ship","Hotel : Tourist"," Footpath : Traveller","2"},
                            {" Seconds : Hours"," Bushel : Corn","  Mile : Length","2"},
                            {"Length : Width"," Gold : Bourne"," Plant : Tree"," Pretty : Beautiful","4"},
                            {"Grass : Gardener"," Medicine : Doctor"," Bridge : Engineer"," Radio : Radiologist","3"},
                            {" Moisture : Humid","  Despair : Anger"," Odour : Pungent","2"},
                            {"Host : Hospitable","  Idealist : Cynical"," Guest : Rude","1"},
                            {"Amusement : Happiness","  Cry : Whisper"," Convulsion : Spasm","4"},
                            {"Cemetery : Death"," Pliable : Bend"," Hydro : Water"," Irreducible : Reduce","2"},
                            {"Wheel : Bicycle","Ship : Steamer","Stove : Kitchen","Fort : Fortress","4"},
                            {" Church : Exocommunicate"," Constitution : Amendment","  Rehearsal : Performance","1"},
                            {" Emotional : Sensitive","Flower : Bud","Employed : Jobless","Happy : Gay","3"},
                            {"Red : Green"," Healthy : Fat"," Brave : Timid"," Slim : Thin","4"},
                            {"Fever : Illness"," Suffering : Trouble"," Lazy : Lethargic","Damp : Arid","3"},
                            {"Touchdown : Penalty","Latitude : Resistence"," Schism : Diverge"," Impasse : Concede","2"},
                            {"Thought : Politics","Water : River","Rest : Weary","Wine : Intoxication","3"},
                            {" Enigmatic : Puzzle","Pallid : Complexion","Insipid : Flavour","Copulent : Weight","2"}
                    },
                    {
                            {" Book"," Paper","Pencil","Pen","1"},
                            {" Sun","Moon","Mars"," Universe","4"},
                            {"Deck","Quay","Stern"," Bow","2"},
                            {" Hostel"," Inn"," Hotel"," Club","4"},
                            {"Pineapple"," Orange","  Banana","4"},
                            {" Lung","Heart","  Kidney","2"},
                            {" Barber","  Blacksmith","Tailor","1"},
                            {" Faraday","  Newton"," Addison","2"},
                            {"Inch","  Yard"," Quart","4"},
                            {"Diameter"," Tangent"," Diagonal"," Arc","3"},
                            {" Tortoise"," Duck"," Whale","Snake","3"},
                            {"Uncle"," Nephew"," Brother"," Niece","3"},
                            {" Listen","Swim"," Walk"," Climb","1"},
                            {"Peak"," Mountain"," Hillock"," Valley","4"},
                            {" Ruffian","Criminal","Gangster","Paragon","4"},
                            {" Reader","Writer","Publisher","Reporter","1"},
                            {" Island","Coast","Harbour","Oasis","4"},
                            {" Bake","Peel","Fry"," Roast","2"},
                            {" Running","Sprinting","Exercising","Jogging","3"},
                            {" Calender","Month","Year","Day","1"}
                    },
                    {
                            {"Under","Near"," Beside"," Where","4"},
                            {" Distress","Calm","Dull","Gloomy","1"},
                            {" Cot"," Sheet"," Quilt"," Blanket","1"},
                            {" Aravali Hills","  Nilgiri Hills","Shivalik Hills","2"},
                            {" Cheras","Chandelas","Pallavas","Cholas","2"},
                            {"Circle","Ellipse","Sphere","Cube","4"},
                            {"Herb","Flower","Tree","Shrub","2"},
                            {"Wheat","Paddy","Jowar","Mustard","4"},
                            {" Snake","Whale","Crocodile","Lizard","2"},
                            {" Teacher"," Principal"," Student"," Lecturer","3"},
                            {"Looks"," Beauty"," Character"," Cuteness","3"},
                            {" Owl"," Eagle"," Hawk"," Parrot","4"},
                            {" Apple"," Mango"," Watermelon"," Guava","3"},
                            {"Brigadier","Commodore","Commander","Admiral","1"},
                            {"Mendicant"," Ascetic"," Pious"," Hermit","3"},
                            {" Graphite"," Pearl"," Diamond"," Coal","2"},
                            {"Trivandrum"," Bangalore"," Bhubaneshwar","Vijayawada","4"},
                            {"Correction"," Improvement"," Betterment"," Elevation","4"},
                            {"IIlusion"," Delusion"," Hallucination"," Identification","4"},
                            {"Stamp : Letter"," Ticket : Train"," Ink : Pen"," Car : Engine","4"}
                    },
                    {
                            {"Death : Disease"," Milk : Butter","  Water : Oxygen","1"},
                            {" Hard : Soft","Long : High"," Sweet : Sour","Pointed : Blunt","2"},
                            {" Petrol : Car","Ink : Pen","Garbage : Dustbin","Lead : Pencil","3"},
                            {" Book : Page"," Table : Drawer"," Loom : Cloth"," Car : Wheel","3"},
                            {" Flower : Petal","Chair : Leg","Circle : Arc","Cover : Page","4"},
                            {"Army : General","Team : Captian","Crache : Infant","Meeting : Chairman","3"},
                            {" Oil : Lamp","Water : Tap","Oxygen : Life","Power : Machine","2"},
                            {" Apple : Jam","Lemon : Citrus","Tomato : Pury","Orange : Squash","2"},
                            {"Shirt : Dress","Boy : Girl","  Table : Furniture","2"},
                            {" BD"," IK"," PN","SU","3"},
                            {"DE","PQ","TU","MO","4"},
                            {" XW","FG","ML","PO","2"},
                            {"BD","MP","NQ","TW","1"},
                            {" BCD","LMN","OPQ","JLM","4"},
                            {"JKL","LMO","VWY","QRT","1"},
                            {"EBA"," XUT"," JFE"," YVU","3"},
                            {" BHE","DJG","SYV","PUS","4"},
                            {" ALMZ","BTUY","CPQX","DEFY","4"},
                            {" BDYW","CEXZ","DFYW","EGXV","2"},
                            {"Carrot","Tomato","Potato","Ginger","2"}
                    },
                    {
                            {"50","51","52","53","3"},
                            {" 24"," 28","31","33","2"},
                            {" 36","38","49","52","1"},
                            {" 15","16"," 13"," 14","4"},
                            {"75"," 81"," 85"," 89","2"},
                            {" 46","48","49","51","1"},
                            {"20","21","22","24","2"},
                            {"93"," 95"," 97"," 99","3"},
                            {" 13"," 14"," 15"," 16","2"},
                            {"140","145","147","159","2"},
                            {" 50","60"," 65","70","3"},
                            {" 26"," 28"," 29"," 34","2"},
                            {" 25","26","27"," 28","1"},
                            {" 17"," 12"," 9"," 13","4"},
                            {" 340"," 380"," 456"," 486","3"},
                            {" 22"," 20"," 18"," 16","1"},
                            {" 141"," 143"," 145"," 147","4"},
                            {" 130"," 132"," 134"," 136","2"},
                            {" 20"," 24"," 26"," 28","3"},
                            {" 110"," 118"," 120"," 122","3"}
                    }
                    ,
                    {
                            {"Iron Box"," Mixie","Computer","Gas Stove","4"},
                            {" Tortoise","Crab","Frog","Fish","4"},
                            {"63","17","13","23","1"},
                            {"64, 83","100, 121","16, 25","36, 49","1"},
                            {"9 - 72","10 - 90","8 - 56","11 - 115","4"},
                            {"Jeevan Raksha Padak","Param Vir Chakra","Padma Bhusan","Bharat Ratna","2"},
                            {"Milk","Ghee","Paneer","Butter","1"},
                            {"Solitaire","Soliloquy","Solitary","Solitude","4"},
                            {"37","62","12","20","4"},
                            {" 1","65","125","216","2"},
                            {" 222","10","68","125","4"},
                            {"41 - 72","12 - 30","51 - 42","11 - 20","1"},
                            {"FIK","DGI","MPR","KND","3"},
                            {"Varanasi","Agra","Haridwar","Allahabad","2"},
                            {"Phycology : Algae","Ornithology : Birds","Mycology : Fungi","Biology : Botany","4"},
                            {"IOU","OUG","AEI","EIO","2"},
                            {"INSXC","MRVBG","AFKPU","EJOTY","2"},
                            {" Papaya","Mango","Pomegranate","Guava","2"},
                            {"Hazrat Muhammed","Sri Ramakrishna Dev","Gautam Buddha","Jesus Christ","2"},
                            {"76","64","38","95","2"}
                    },
                    {
                            {"Nephew"," Uncle","Either father or uncle","Father","3"},
                            {" Father","Brother","Uncle","Cousin","2"},
                            {" His son","His nephew","His uncle","His cousin","1"},
                            {"Mother","Sister","Aunt","Grandmother","3"},
                            {"Brother","Son","Uncle","Son-in-law","1"},
                            {"Son","Brother","Grandson","Cousin","3"},
                            {"Wife","mother","daughter-in-law","daughter","4"},
                            {"Mother","Aunt","Sister","Daughter","3"},
                            {"Grandson","Son","Nephew","Son-in-law","1"},
                            {"Brother-in-law","Brother","Cousin","Uncle","1"},
                            {"His own","His Grandfater","His Son","His Father","3"},
                            {"Sister","Grand Mother","Grandfather","Mother","4"},
                            {"Anusha Father","Anusha Mother","Anusha Brother","Maternal Uncle","3"},
                            {"His child","His father","His grandson","His nephew","1"},
                            {"Sister","Mother","Cousin","Grandmother","1"},
                            {"Brother","Sister","Nephew","Can’t determined","4"},
                            {" Father","Grandfather","Either Grandmother or Grandfather","Grandmother","3"},
                            {"Brother","Uncle","Father","Grand father","3"},
                            {"Grand-daughter","Daughter","Sister","Aunt","3"},
                            {"Uncle","Brother","Husband","Father","4"}
                    },
                    {
                            {" N","P","O","Q","3"},
                            {"S","E","L","O","2"},
                            {"One","Two","Three","Four","4"},
                            {"I","T","N","R","2"},
                            {" 3","2","1","5","2"},
                            {" 3","4","1","2","4"},
                            {" Y","W","G","F","2"},
                            {"3","4","5","6","3"},
                            {"T","S","R","C","2"},
                            {"O","P","Q","R","3"},
                            {"T","L","R","S","3"},
                            {"One","Two","Three","Four","2"},
                            {"C","D","E","L","4"},
                            {"1","2","3","4","2"},
                            {"A","E","B","C","2"},
                            {"QH","NR","ZH","IB","1"},
                            {" One","Two","Three","Four","3"},
                            {"O","R","S","P","4"},
                            {"1","2","3","4","2"},
                            {"O","R","T","U","3"}
                    },
                    {
                            {"12"," 15","30","36","2"},
                            {"35","37","38","40","4"},
                            {"6 years","12 years","14 years","16 years","2"},
                            {"10","15","17","27","1"},
                            {" 70","75","80","85","2"},
                            {"240 gm"," 220 gm"," 225 gm","250 gm","1"},
                            {" 9"," 10"," 12"," 15","4"},
                            {" 20"," 45"," 55"," 90","2"},
                            {" 12","16"," 24"," 18","2"},
                            {"48","44","42"," 40","3"},
                            {" 8"," 10","12"," 14","4"},
                            {" 4 day"," 10 day"," 40 day"," 100 day","4"},
                            {" 10"," 12","14"," 18","2"},
                            {" 25","37","54"," 65","1"},
                            {"5","8"," 10","15","4"},
                            {" 9, 46","9, 50"," 10, 46"," 10, 50","2"},
                            {" 12"," 15"," 18"," 20","2"},
                            {" 2"," 3"," 4"," 5","2"},
                            {" 1683"," 1692"," 1598","1458","1"},
                            {"24","26","28","25","2"}

                    }
            };
            ans=an;
        }
        else if(k==3){
            String an[][][] = {
                    {{"Tring Tring", "Tap Tap", "Click Click", "Dhak Dhak", "4"},
                            {"Madhya Pradesh", "Odisha", "Bihar", "Uttar Pradesh", "2"},
                            {"Krishna", "Indra", "Kunti", "Madri", "3"},
                            {"Brazil", "India", "Mexico", "China", "2"},
                            {"Wimbledon Final", "Ashes test", "Australian Ladies final", "Champions Trophy Final","1"},
                            {"CBI Director", "Chief Justice of India", "Chief Election Commissioner", "National Security Advisor", "2"},
                            {"Earthworm", "Snail", "Black Sea Bass", "Termite", "4"},
                            {"Harbhajan Singh", "Muttiah Muralitharan", "Saqlain Mushtaq", "Anil Kumble", "3"},
                            {"Prawns", "Fish", "Crabs", "Turtles", "2"},
                            {"Iron", "Calcium", "Zinc", "Sodium", "2"}},
                    {
                            {"Tipu Sultan", "Chandragupta Maurya", "Maharana Pratap", "Ashoka", "3"},
                            {"Test Cricket", "Rugby Union", "Kabaddi", "Carrom", "1"},
                            {"Chandraprabha", "Chandragupta", "Chandrakanta", "Chandraabha", "3"},
                            {"Tashi Malik", "Raha Moharrak", "Samina Baig", "Arunima Sinha", "4"},
                            {"Oxygen", "Chlorine", "fluorine", "hydrogen", "3"},
                            {"Dhyan Chand", "Ranjitsinhji", "C K Nayudu", "I A K Pataudi", "1"},
                            {"Rasgulla", "Pakoda", "Laddu", "Faluda", "2"},
                            {"Destroyer", "Submarine", "Aircraft Carrier", "Patrol Vehicle", "2"},
                            {"Baisakhi", "Dhanteras", "Vishvakarma Puja", "Saraswati Puja", "3"},
                            {"Hockey", "Football", "Volleyball", "Basketball", "1"}
                    },
                    {
                            {"Uttrakhand", "Arunachal Pradesh", "Jammu and Kashmir", "Sikkim", "1"},
                            {"Sulcata Tortoise", "Grenada Tortoise", "Golden Greek Tortoise", "Galapagos Tortoise", "4"},
                            {"Polio", "HIV/AIDS", "Family Planning", "Malnutrition", "4"},
                            {"Sir John Shore", "Lord Curzon", "Lord Cornwallis", "Lord Chelmsford", "3"},
                            {"Raina Beeti Jaye", "Kohli Na Aye", "Yuvi sateiyein", "Gambhir rulaye", "1"},
                            {"Allahabad", "Agra", "Ajmer", "Amritsar", "2"},
                            {"Sharmilli Sheila", "Mazedaar Munni", "Meethi Jalebi", "Chikni Chameli", "4"},
                            {"Kedarnath", "Badrinath", "Amarnath Cave", "Vaishno Devi", "2"},
                            {"Blue Circle", "Red Ribbon", "Pink Balloon", "White Bird", "2"},
                            {"Spirit of Nirbhaya", "Courage of Malala Yousafzai", "Women of India", "Victims of acid attack", "1"}
                    },
                    {
                            {"Mere Dad Ki Maruti", "Chennai Express", "Ghanchakkar", "Race 2", "2"},
                            {"Agastya", "Durvasa", "Chyavana", "Charaka", "3"},
                            {"Jwala Gupta", "P V Sindhu", "Saina Nehwal", "Ashwini Ponnappa", "2"},
                            {"DBCA", "BDAC", "CBDA", "ABCD", "2"},
                            {"Hunger", "Thirst", "Light", "Sound", "3"},
                            {"Operation Cyclone", "Operation Meghdoot", "Operation Cactus", "Operation Pawan", "4"},
                            {"Vitamin A", "Vitamin X", "Vitamin D", "Vitamin E", "2"},
                            {"Calicut", "Diu", "Vasco Da Gama", "Cochin", "4"},
                            {"Twitter", "Angry Birds", "Whatsapp", "Instagram", "2"},
                            {"Hema Malini", "Maneka Gandhi", "Yashodhara Raje Scindia", "Najma Heptullah", "4"}
                    },
                    {
                            {"Surpanakha", "Khara", "Maricha", "Dushana", "3"},
                            {"Manchurian", "Burger", "Rice", "Pasta", "3"},
                            {"Mohan Lal Sukhadia", "Bhairon Singh Shekhawat", "Ashok Gehlot", "Vasundhara Raje Sindia", "1"},
                            {"DACB", "ABCD", "DCAB", "BCDA", "3"},
                            {"Infosys", "TCS", "WIPRO", "HCL", "1"},
                            {"Bikaner", "Ludhiana", "Khajuraho", "Jodhpur", "3"},
                            {"Blue Whale", "African Elephant", "Hippopotamus", "Giant Panda", "1"},
                            {"CDBA", "DBCA", "CBDA", "ABCD", "1"},
                            {"Teja", "Mogambo", "Gabbar", "Shakaal", "1"},
                            {"Yusmarg", "Kulgam", "Drass", "Leh", "3"}
                    },
                    {
                            {"Syed Yousaf Raza Gillani", "Benazir Bhutto", "Liaqat Ali Khan", "Nawaz Sharif", "4"},
                            {"Rukhsar", "Mushaira", "Shikara", "Mahabara", "2"},
                            {"France", "Russia", "England", "Germany", "2"},
                            {"CDBA", "ABCD", "DCBA", "DABC", "4"},
                            {"INS Viraat", "INS Shaurya", "INS chakra", "INS Vikrant", "4"},
                            {" Malala", " Sir William Lawrence Bragg ", "Werner Heisenberg", "Paul A.M. Dirac", "1"},
                            {"Janata Dal (S)", "Telugu Desam Party", "Janata Dal (United)", "Biju Janata Dal", "3"},
                            {"ACBD", "ABDC", "ACDB", "BDCA", "1"},
                            {"Geneva", "Schengen", "Prague", "Maastricht", "2"},
                            {"Chhora", "Jatt", "Munda", "Puttar", "2"}
                    },
                    {
                            {"Sloth", "Ant", "Spider", "Termite", "3"},
                            {"Strontium", "Potassium", "Iron", "Calcium", "1"},
                            {"Hansa Mehta", "Rajkumari Amrit Kaur", "Sarojini Naidu", "Sushila Nayyar", "2"},
                            {"Wazir", "Nawab", "Sarpanch", "Patbari", "1"},
                            {"Uttar Pradesh", "Bihar", "West Bengal", "Odisha", "2"},
                            {"Bhagwan Jha Azad", "Jaganth Mishra", "Sateyndra nath Sinha", "Bindheswar Dubey", "2"},
                            {"Assam", "Arunachal Pradesh", "Punjab", "Haryana", "2"},
                            {"ABDC", "ABCD", "CDBA", "CBDA", "3"},
                            {"Miss Universe", "Miss Earth", "Miss Asia Pacific", "Miss World", "4"},
                            {"Credit of salary", "Resignation", "Promotion", "Appointment", "3"}
                    },
                    {

                            {"Mobile Phone", "Computer Mouse", "Bluetooth Mouse", "Digital camera", "2"},
                            {"The Royal baby", "Telangana", "INS Vikrant", "Nargis' last unreleased film", "2"},
                            {"Raita", "Papdi", "Sabji", "Pulaav", "3"},
                            {"Sumitra", "Bharata", "Dasharatha", "Manthara", "4"},
                            {"Muhammad Iqbal", "Bankim Chandra Chatterjee", "RabindraNath Tagore", "Sri Aurobindo", "3"},
                            {"Vishwamitra", "Durvasa", "Kanva", "Kapil", "2"},
                            {"Anju Bobby George", "Anjali Bhagwat", "Krishna Poonia", "Mary Kom", "3"},
                            {"Munna", "D K Bose", "Milkha", "Lola", "3"},
                            {"Queens Park Rangers", "Newcastle United", "Liverpool", "Manchester City", "4"},
                            {"Gautam Ghose", "Rituparno Ghosh", "Buddhadeb Dasgupta", "Aparna Sen", "2"}
                    },
                    {
                            {"Diamond Harbour", "Darjeeling", "Murshidabad", "Dhaka", "1"},
                            {"K R Narayan", "A P J Abdul Kalam", "R Venkataraman", "Shankar Dayal Sharma", "1"},
                            {"Trunk Call", "Telegram", "Post Card", "Toy Train", "2"},
                            {"Rahul", "Sanjay", "Varun", "Rajiv", "3"},
                            {"Badrinath", "Kedarnath", "Vaishano Devi", "Amarnath", "2"},
                            {"Brendon McCullum", "Suresh Raina", "Chris Gayle", "Virat Kohli", "3"},
                            {"Aansu", "Prem Pathik", "kaanan Kusum", "Kamayani", "4"},
                            {"Irfan and Yusuf Pathan", "Ravindra and Ajay Jadeja", "Bhuvneshwar and Vinay Kumar", "Ishant and Rohit Sharma", "1"},
                            {"Capris", "Bikini", "Bermuda", "Hoodie", "2"},
                            {"Shiva", "Himalaya", "Parvati", "Kartikeya", "1"}
                    },
                    {
                            {"Charles Duke", "James A Lovell", "Alan Bean", "Pete Conrad", "2"},
                            {"The Ransom of Red Chief", "The Gift of the Magi", "The Last leaf", "The Third Ingredient", "3"},
                            {"Vaishakhi", "Makar Sankranti", "Vasant Panchami", "Narak Chaturdashi", "2"},
                            {"AADMI", "PURUSH", "MARD", "MAANAV", "3"},
                            {"Bhuvneshwar Kumar", "Shikhar Dhawan", "Ravinder Jadeja", "Mahendra Singh Dhoni", "4"},
                            {"Dashing Phone", "Cool Phone", "Smartphone", "Long Phone", "3"},
                            {"Bangladesh", "Nepal", "China", "Sri Lanka", "2"},
                            {"Rudra", "Nataraja", "Ardhanarishwara", "Bhairava", "2"},
                            {"Gwalior", "Alwar", "Bhopal", "Rampur", "3"},
                            {"Blood Money", "Talaash", "Chakrvayuh", "Special 26", "4"}
                    },
                    {
                            {"Meghnad Saha", "Subrahmanyan Chandrasekhar", "Prabodh Chandra Sengupta", "Vainu Bappu", "1"},
                            {"Genda", "Gulaab", "Gudaudi", "Gulbahar", "2"},
                            {"Bulle Shah", "Nizamuddin Aulia", "Moinuddin chisti", "Shahbaz Kalandar", "4"},
                            {"Bharuch", "Surat", "Porbandar", "Khambat", "2"},
                            {"Sant Ravidas Nagar", "Sant Kabir Nagar", "Ambedhkar Nagar", "Gautam Buddh Nagar", "4"},
                            {"Not taking Wickets", "Not winning tosses", "Not bowling full tosses", "Not Scoring runs", "4"},
                            {"Anupam Kher", "Paresh Rawal", "Boman irani", "Satish Kasushik", "2"},
                            {"Ugaane waale ka kaam", "Kharidne waale kaa daam", "Pakaane waale ka paigam", "Khaane waale ka naam", "4"},
                            {"Sukma", "Bastar", "Dantewada", "Mahasamund", "2"},
                            {"Ambani", "Tata", "Birla", "Bajaj", "3"}
                    },
                    {
                            {"Viewership of an IPL match", "Election expenditure", "Population of countries", "Films box office collections", "4"},
                            {"Points", "Playing sessions", "Headgears", "Punches", "4"},
                            {"Jammu", "Vidarbha", "Saurashtra", "Bundelkhand", "1"},
                            {"Acharya Vinoba Bhave", "Sant Kabir", "Mahatma Gandhi", "Gul Ahmed", "2"},
                            {"Natwest Series", "Asia Cup", "ICC Championship Trophy", "Twenty20 World Cup", "3"},
                            {"Dust", "Water vapour", "Smoke", "Sunlight", "2"},
                            {"BDAC", "ABCD", "DBCA", "DCBA", "1"},
                            {"Rectangle", "Square", "Triangle", "Pentagon", "3"},
                            {"A", "B", "C", "K", "4"},
                            {"Polar Bear", "Grizzly Bear", "Royal Bengal Tiger", "Gorilla", "1"}
                    }};

            ans=an;
        }

















    }






}
