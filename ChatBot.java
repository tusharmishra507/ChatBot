import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Welcome to LIET. I am Jojo, your admission assistant.");
        System.out.println("Hey! What's your name?");
        String name = sc.nextLine();

        System.out.println("Please enter your phone number to receive the best assistance.\n");
        long number = sc.nextLong();
        sc.nextLine(); 
        if (String.valueOf(number).length() >= 10) {
            System.out.println(name + ", Thank you for providing your number.");
        } else {
            System.out.println(name + ", please provide a valid number.");
            return;
        }

        System.out.println(name + ", do you need information about LIET?");
        System.out.println("Yes or No");
        String question = sc.nextLine().toLowerCase();

        if (question.equals("yes")) {
            System.out.println("Okay, " + name + ".\n");
        } else if (question.equals("no")) {
            System.out.println("Okay, no problem.");
            return;
        } else {
            System.out.println("Invalid input. Please enter Yes or No.");
            return;
        }

        Map<String, String> courses = new HashMap<>();
        courses.put("B.Tech CSE", "ADMISSION TO B.TECH. FIRST YEAR:\n" +
                "A- Admissions through AKTU Counselling (JEE (main) score)\n" +
                "State Counselling 2023/JEE (main)/AKTU qualified candidates have to report in the college with allotment letter issued by AKTU in favor of Lloyd Institute of Engineering & Technology, College Code: 153 to complete the admission process till the date mentioned on the allotment letter.\n" +
                "Bring Original Documents for Verification at the time of reporting.\n" +
                "Carry two photocopy sets of the Documents (self-attested).\n" +
                "Rest of the procedures would be completed in the college only.\n" +
                "B- Direct Admissions\n" +
                "Please visit www.liet.in and click on the Admission Enquiry form link and get yourself registered with the Instructions mentioned on the page.\n" +
                "You would be informed by the authorities to attend the test/interview.\n" +
                "If qualified, you have to report to the college on the date given by the College authorities with the academic documents, passport size photo, and Aadhar card.\n" +
                "Email : admission@liet.in\n" +
                "C- Eligibility\n" +
                "As per AICTE / AKTU norms.\n" +
                "The applicant should be a citizen of India.\n");
        courses.put("B.Tech AIML", "True to its commitment to the core principle of Industry Link, Lloyd has recognized the urgent need of the industry for next generation digitally skilled engineers. Responding to this need, it has upgraded its curriculum to incorporate Academic collaborations with the major IT leaders of the globe to provide a pool of digital technologies.\n" +
                "The department offers a full-time B.Tech in Computer Science and Engineering (CSE) and MCA degree under AKTU and are AICTE approved.\n" +
                "According to a recent release by NASSCOM, the skills of the future would be Big Data Analytics, Cloud & Cybersecurity Services, IoT, Artificial Intelligence and many other Digital Technologies. A huge demand is foreseen for roles such as mobile app development, social media, data scientists & platform engineering. According to a McKinsey report on ‘Technology Jobs & the Future of Work’, digital technologies could contribute $550 billion to $ 1 trillion of economic impact per year in India by the year 2025. According to another renowned survey, 69% of IT leaders expect a huge surge in the job market in the next 3 to 5 years due to digital technologies.\n" +
                "This has led Lloyd to infuse the CSE’s beyond curriculum area with relevant digital technologies that will enable students to add immense value to the organisations they will join.\n" +
                "Department is powered by a project-based learning methodology which enables the teacher and the group of students to mould the learning style dependent on the profile of the learners and create an environment to provide constructivism and collaborative learning.\n" +
                "The ‘flipped-classroom’ model and a unique mastery learning platform is integrated into the project-based learning approach.\n" +
                "Department will be embedded with Full Stack Programming, Big Data, Machine Learning, Natural Language Processing, Artificial Intelligence and Internet of Things (IoT) curriculum to make it more industry relevant.\n" +
                "Department possess Academic collaboration and Specialised certification courses with MICROSOFT, IBM, ORACLE, AMAZON WEB SERVICES:\n" +
                "Data Science\n" +
                "Big Data Engineering\n" +
                "Cyber Security\n" +
                "Cloud Computing\n" +
                "Artificial Intelligence\n");
        courses.put("B.Tech EC", "Electronics and Communication Engineering is one of the fastest growing fields in engineering and equipped with a lot of specializations including VSLI, microwave engineering, communication network, embedded system, etc. Due to the vast application, the department was established with an objective to impart exhaustive knowledge of core subjects, and develop technical and professional skills of the students. The department offers full time B.Tech program in Electronics and Communication Engineering affiliated from AKTU and AICTE approved. All the faculties in the department have good academic/industrial background along with worthy research expertise. The department is equipped with good infrastructure facilities, fully-functional laboratories and individual collection of books apart from central library for supporting effective teaching and research activities. The collaborative culture of research and teaching helps the student in understanding the concept in a better way and aware the students about recent technologies around the globe. The Department of Electronics and Communication Engineering at LIET, Greater Noida prefers this collaborative teaching-research culture. A healthy research environment is formed in the department that helps faculties as well as students to explore new areas and improve their technical and analytical skills. The curriculum of the departments also include ethical and professional skill development programs including workshop, seminars, technical fest, quiz, games, etc. that helps students to grow their overall personality along with technical skills.\n" +
                "As per the institute Co-Op program, the department is also providing specialized training in the areas of microelectronics, telecommunication to VLSI Design and fabrication that develop expertise and knowledge of the students to compete in the respective fields of industries and academia.\n");
        courses.put("MCA", "MCA (Master of Computer Applications)\n" +
                "The Department of Computer Applications under LIET School of Computer Applications has been imparting knowledge with the most modern curriculum and syllabus to students of the post graduate course. It offers a post graduate two years degree course that is approved by AICTE and affiliated to Dr APJ Abdul Kalam Technical University, Lucknow. The Department aims to bring Innovation in technology; to go beyond fundamentals with a view to building interest in students with all the new advancements in the field of computers. The department endeavours to play a vital role in the applications of computers by promoting innovative work in android, iOS, cloud computing, machine learning etc. we are committed to providing an exciting academic program to prepare students for the greatest challenges of the 21st century.\n");

        // Show course options
        System.out.println(name + ", Please select your course to receive more information:");
        for (String course : courses.keySet()) {
            System.out.println("- " + course);
        }

        // Get user input and normalize it
        String selectedCourse = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Normalize the course keys in the map
        Map<String, String> normalizedCourses = new HashMap<>();
        for (Map.Entry<String, String> entry : courses.entrySet()) {
            normalizedCourses.put(entry.getKey().toLowerCase().replaceAll("\\s+", ""), entry.getValue());
        }

        // Provide course information
        if (normalizedCourses.containsKey(selectedCourse)) {
            System.out.println("Course Information: " + normalizedCourses.get(selectedCourse));
        } else {
            System.out.println("Sorry, the course you selected is not available.");
        }

        Map<String, String> information = new HashMap<>();
        information.put("Admission Process", "ADMISSION TO B.TECH. FIRST YEAR:\r\n" +
                "A- Admissions through AKTU Counselling (JEE (main) score)\r\n" +
                "\r\n" +
                "State Counselling 2023/JEE (main)/AKTU qualified candidates have to report in the college with allotment letter issued by AKTU in favor of Lloyd Institute of Engineering & Technology, College Code: 153 for complete the admission process till date as mentioned on the allotment letter.\r\n" +
                "\r\n" +
                "Bring Original Documents for Verification at the time of reporting.\r\n" +
                "Carry two photo copy sets of the Documents (self-attested).\r\n" +
                "Rest of the procedures would be completed in the college only.\r\n" +
                "B- Direct Admissions\r\n" +
                "Please visit www.liet.in and click on Link Admission Enquiry form and get yourself registered with the Instructions mentioned in the page.\r\n" +
                "You would be informed by the authorities to attend the test / interview.\r\n" +
                "If qualified, you have to report to the college on the date given by the College authorities with the academic documents, passport size photo and Aadhar card.\r\n" +
                "Email : admission@liet.in\r\n" +
                "C- Eligibility\r\n" +
                "As per AICTE / AKTU norms.\r\n" +
                "Applicant should be a citizen of India.\r\n" +
                "ADMISSION TO MCA FIRST YEAR:\r\n" +
                "Admission through CUET Score:\r\n" +
                "\r\n" +
                "85% seats of total approved intake will be filled through UP State Counselling and remaining 15% seats of approved intake will be filled under management quota.\r\n" +
                "Direct Admission:\r\n" +
                "Candidate must have passed Bachelor’s degree course of 03 Years minimum duration from any recognized Indian University; or its equivalent, recognized by A.I.U. securing minimum 50% (45% for SC/ST) marks in aggregate. Candidate must have passed Mathematics at 10+2 level or Graduation level.\n");
        information.put("About Us", "LIET, Lloyd Institute of Engineering & Technology has become a place where dreams are indeed transformed into reality. The institute is affiliated to Dr. A.P.J. Abdul Kalam Technical University (Formerly UPTU) and recognized by the A. I. C. T. E. (Min of HRD), New Delhi, and the U.P. Govt. LIET has been constantly engaged in moulding the lives of future engineers with the employment of innovative approaches that are job-oriented only.\r\n" +
                "\r\n" +
                "LIET keeping the progressive approach aims at imparting the latest knowledge, pertinent to the mentioned domains, having the updated curriculum, research, and practice to use. Under banner of LIET there are different courses which make up different ways of bettering life all over the world. LIET with its great teaching staff and hard-working faculty members keeps the students aligned with a great working standard which helps them throughout from education to career.\r\n" +
                "\r\n" +
                "The college keeps abreast of the latest teaching pedagogy keeping up the current engineering trends & innovations ensuring the students get the best of it. LIET is frontier in placements with an exclusive 360-degree training program. These enable the worthy students of LIET to get jobs in notable companies like Tech Mahindra, IBM, TCS, Wipro, Infosys, and HCL etc.\n");
        information.put("Contact Details", "Contact No.+91-9821582662\r\n" +
                "\r\n" +
                "Women Help Line No. +91-8130073738\r\n" +
                "\r\n" +
                "admission@liet.in\n");
        information.put("Request Callback", "Okay, we will contact you soon.\n");
        information.put("Apply Now", "https://liet.in/btech-admission/\n");

        //  this code used for Show information options
        System.out.println("Please select a category to get more information:");
        for (String info : information.keySet()) {
            System.out.println("- " + info);
        }

        while (true) {
            String selectedInfo = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

            if (selectedInfo.equals("exit")) {
                System.out.println("Thank you! Have a great day.\n");
                break;
            }

            // Normalize the information keys in the map
            Map<String, String> normalizedInformation = new HashMap<>();
            for (Map.Entry<String, String> entry : information.entrySet()) {
                normalizedInformation.put(entry.getKey().toLowerCase().replaceAll("\\s+", ""), entry.getValue());
            }

            // Provide information
            if (normalizedInformation.containsKey(selectedInfo)) {
                System.out.println(" " + normalizedInformation.get(selectedInfo));
            } else {
                System.out.println("Sorry, the information you selected  is not available.");
            }
        }

        System.out.println("Do you have a question, " + name + "?");
        System.out.println("Yes or No");
        String userResponse = sc.nextLine();

        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.println("Please tell me about your question:\n");
            String userQuestion = sc.nextLine();
            System.out.println("Okay " + name + ", our team will contact you soon.");
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.println("Okay, have a nice day!");
        } else {
            System.out.println("Invalid response. Please enter 'yes' or 'no'.");
        }

        sc.close();
    }
}