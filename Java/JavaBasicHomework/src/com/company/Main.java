package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    private static Scanner input = new Scanner(System.in);
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) throws ParseException {


    }

    public static void printCharArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int getIndexOfLetter(char letter, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (letter == arr[i])
                return i;
        }
        return -1;
    }

    public static int getSumLeft(int border, int[] nums) {
        int sum = 0;
        for (int i = 0; i < border; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int getSumRight(int border, int[] nums) {
        int sum = 0;
        for (int i = border + 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void detonateLeft(List<Integer> list, int index, int power) {
        for (int j = index - 1, cnt = 0; j >= 0 && cnt < power; cnt++, j--) {
            list.remove(j);
        }
    }

    public static void detonateRight(List<Integer> list, int index, int power) {
        for (int j = index, cnt = 0; j < list.size() && cnt <= power; cnt++, j++) {
            list.remove(j);
            j--;
        }
    }

    public static int getRandomIndex(String[] arr) {
        Random rnd = new Random();
        int index = rnd.nextInt(arr.length);
        return index;
    }

    public static void assignGrades(Student student, String[] grades) {
        for (int i = 1; i < grades.length; i++) {
            student.addGrade(Double.parseDouble(grades[i]));
        }
    }

    public static void assignAvg(List<Student> studs) {
        for (Student stud : studs) {
            stud.calculateAverage();
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student st : students) {
            if (st.getAverageGrade() >= 5.00)
                System.out.printf("%s -> %.2f\n", st.getName(), st.getAverageGrade());
        }
    }

    public static void sortByGrade(List<Student> students) {
        for (int j = 0; j < students.size(); j++) {
            for (int i = 0; i < students.size() - 1; i++) {
                Student st1 = students.get(i);
                Student st2 = students.get(i + 1);
                if (st1.getName().equals(st2.getName())) {
                    if (st1.getAverageGrade() < st2.getAverageGrade()) {
                        Student temp = new Student();
                        temp.setName(st1.getName());
                        temp.setAverageGrade(st1.getAverageGrade());
                        st1.setName(st2.getName());
                        st1.setAverageGrade(st2.getAverageGrade());
                        st2.setAverageGrade(temp.getAverageGrade());
                        st2.setName(temp.getName());
                    }
                }
            }
        }

    }

    public static Comparator<Student> getCompByName()
    {
        Comparator comp = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2)
            {
                return s1.getName().compareTo(s2.getName());
            }
        };
        return comp;
    }

    public static void bombNumbers() {
        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] specials = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bombNumber = specials[0];
        int power = specials[1];
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }


        while (numbers.contains(bombNumber)) {
            int index = numbers.indexOf(bombNumber);
            detonateLeft(numbers, index, power);
            index = numbers.indexOf(bombNumber);
            detonateRight(numbers, index, power);
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.printf("%d\n", sum);
    }

    public static void reverseString() {
        String text = input.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        System.out.printf("%s\n", sb.toString());
    }

    public static void fitStrIn20Chars() {
        String text = input.nextLine();
        StringBuilder sb = new StringBuilder(text);
        if (text.length() > 20) {
            sb.replace(20, text.length(), "");
        }
        if (text.length() < 20) {
            while (sb.length() < 20) {
                sb.append("*");
            }
        }

        System.out.printf("%s\n", sb.toString());
    }

    public static void censorEmail() {
        StringBuilder sb = new StringBuilder();
        String email = input.nextLine();
        String text = input.nextLine();
        String username = email.split("@")[0];
        for (int i = 0; i < username.length(); i++) {
            sb.append("*");
        }
        sb.append("@");
        sb.append(email.split("@")[1]);
        String replacement = sb.toString();
        text = text.replace(email, replacement);
        System.out.printf("%s", text);

    }

    public static void URLParser() {
        String text = input.nextLine();
        Pattern serv = Pattern.compile("(?<server>(^|(?<=\\:\\/\\/))[a-zA-Z.-]+($|(?=\\/)))");
        Pattern protoc = Pattern.compile("^\\w+(?=\\:\\/\\/)");
        Pattern resource = Pattern.compile("(?<=(\\w\\/)).*");
        String server = "";
        String protocol = "";
        String res = "";
        Matcher s = serv.matcher(text);
        if (s.find( ))
            server = s.group(0);
        Matcher p = protoc.matcher(text);
        if (p.find( ))
            protocol = p.group(0);
        Matcher r = resource.matcher(text);
        if (r.find( ))
            res = r.group(0);
        System.out.printf("[protocol] = \"%s\"\n", protocol);
        System.out.printf("[server] = \"%s\"\n", server);
        System.out.printf("[resource] = \"%s\"\n", res);
    }

    public static void changeToUppercase() {
        String text = input.nextLine();
        Pattern up = Pattern.compile("(<upcase>.*?<\\/upcase>)");
        Pattern between = Pattern.compile("(?<=<upcase>).*(?=<\\/upcase>)");
        Matcher match = up.matcher(text);
        while (match.find( )) {
            String target = match.group(0);
            Matcher btwn = between.matcher(target);
            if (btwn.find( )) {
                text = text.replace(target, btwn.group(0).toUpperCase());
            }
            match = up.matcher(text);
        }
        System.out.println(text);
    }

    public static void phonebook() {
        Map<String, String> contactList = new TreeMap<>();
        String text = input.nextLine();

        while (!(text.equals("END"))) {

            String[] info = text.split(" ");
            if (info[0].equals("A")) {
                String name = info[1];
                String number = info[2];
                contactList.put(name, number);
            }
            else if (info[0].equals("S")) {
                String name = info[1];
                if (contactList.containsKey(name)) {
                    System.out.printf("%s -> %s\n", name, contactList.get(name));
                }
                else
                    System.out.printf("Contact %s does not exist.\n", name);
            }
            else if (text.equals("ListAll")) {
                for (String contact : contactList.keySet()) {
                    System.out.printf("%s -> %s\n", contact, contactList.get(contact));
                }
            }

            text = input.nextLine();
        }
    }

    public static void circleIntersection() {
        double[] values1 = Arrays.stream(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Point point = new Point();
        point.setX(values1[0]);
        point.setY(values1[1]);
        Circle circle1 = new Circle();
        circle1.setCentre(point);
        circle1.setRadius(values1[2]);

        double[] values2 = Arrays.stream(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Point point2 = new Point();
        point2.setY(values2[1]);
        point2.setX(values2[0]);
        Circle circle2 = new Circle();
        circle2.setCentre(point2);
        circle2.setRadius(values2[2]);

        double distance = Math.sqrt(Math.pow(point.getX() - point2.getX(), 2)
                + Math.pow(point.getY() - point2.getX(), 2));

        double radSum = circle1.getRadius() + circle2.getRadius();

        if (distance <= radSum)
            System.out.println("Yes");
        else
            System.out.println("No");


    }

    public static void advertisementMessage() {

        String[] phrases =  {"Excellent product.", "Such a great product."
                , "I always use that product.", "Best product of its category."
                , "Exceptional product.", "I can't live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product."
                , "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome."
                , "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        StringBuilder sb = new StringBuilder();

        sb.append(phrases[getRandomIndex(phrases)] + " ");
        sb.append(events[getRandomIndex(events)] + " ");
        sb.append(authors[getRandomIndex(authors)]);
        sb.append(" - ");
        sb.append(cities[getRandomIndex(cities)]);
        System.out.println(sb.toString());


    }

    public static int varInHexaFormat() {
        String text = input.nextLine();
        int res = Integer.parseInt(text, 16);
        return res;
    }

    public static void boolVar() {
        String text = input.nextLine();
        if (text.equals("True"))
            System.out.println("Yes");
        else if (text.equals("False"))
            System.out.println("No");
    }

    public static void reversedLetters() {
        String[] ch = new String[3];
        for (int i = 0; i < 3; i++) {
            ch[i] = input.nextLine();
        }

        for (int i = 2; i >= 0; i--) {
            System.out.printf("%s", ch[i]);
        }
    }

    public static void vowelOrDigit() {
        char ch = input.next().toLowerCase().charAt(0);
        if (Character.isDigit(ch))
            System.out.println("digit");
        else {
            if (ch == 'a' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'e') {
                System.out.println("vowel");
            }
            else
                System.out.println("other");
        }
    }

    public static void intToHexAndBin() {
        int number = Integer.parseInt(input.nextLine());
        System.out.println(Integer.toHexString(number).toUpperCase());
        System.out.println(Integer.toBinaryString(number));
    }

    public static void compareCharArrays() {
        String[] arr1 = input.nextLine().split(" ");
        String[] arr2 = input.nextLine().split(" ");
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            if (arr1[i].charAt(0) < arr2[i].charAt(0)) {
                printCharArr(arr1);
                printCharArr(arr2);
                return;
            }
            if (arr1[i].charAt(0) > arr2[i].charAt(0)) {
                printCharArr(arr2);
                printCharArr(arr1);
                return;
            }
        }
        if (arr1.length < arr2.length) {
            printCharArr(arr1);
            printCharArr(arr2);
        }
        else {
            printCharArr(arr2);
            printCharArr(arr1);
        }
    }

    public static void maxSeqEqualElements() {
        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxStart = 0;
        int maxEnd = 0;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int cnt = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                    if (cnt > max) {
                        maxStart = i;
                        maxEnd = j;
                        max = cnt;
                    }
                }
                else
                    break;
            }
        }
        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }

    public static void maxIncrSeq() {
        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int flag = 0;
        List<String> sequences = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            flag = nums[i];
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i] + " ");
            for (int j = i + 1; j < nums.length; j++) {
                if (flag < nums[j]) {
                    sb.append(nums[j] + " ");
                    flag = nums[j];
                }
                else
                    break;
            }
            sequences.add(sb.toString());
        }

        int maxLength = 1;
        String maxSeq = "";

        for (String seq : sequences) {
            int[] temp = Arrays.stream(seq.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (temp.length > maxLength) {
                maxLength = temp.length;
                maxSeq = seq;
            }

        }

        System.out.println(maxSeq);


    }

    public static void mostFreqNumber() {
        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        int mostFrNum = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int cnt = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                    if (max < cnt) {
                        max = cnt;
                        mostFrNum = nums[i];
                    }
                }
            }
        }
        System.out.println(mostFrNum);
    }

    public static void indexOfLetters() {
        char[] letters = new char[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++, i++) {
            letters[i] = ch;
        }

        String text = input.nextLine().toLowerCase();
        for (int j = 0; j < text.length(); j++) {
            System.out.printf("%c -> %d\n", text.charAt(j),getIndexOfLetter(text.charAt(j), letters));
        }
    }

    public static void equalSums() {
        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < nums.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            if (i == 0)
                sumRight = getSumRight(0, nums);
            else if (i == nums.length - 1)
                sumLeft = getSumLeft(nums.length - 1, nums);
            else {
                sumLeft = getSumLeft(i, nums);
                sumRight = getSumRight(i, nums);
            }
            if (sumLeft == sumRight) {
                System.out.printf("%d\n", i);
                return;
            }

        }
        System.out.printf("no\n");
    }

    public static void averageGrades() {
        List<Student> studs = new ArrayList<>();
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String[] text = input.nextLine().split(" ");
            String name = text[0];
            Student student = new Student();
            student.setName(name);
            assignGrades(student, text);
            studs.add(student);
        }

        assignAvg(studs);
        Collections.sort(studs, getCompByName());
        sortByGrade(studs);
        printStudents(studs);
    }

    public static void workingDays() throws ParseException {
        String fD = input.nextLine();
        String sD = input.nextLine();
        Date firstDate = sdf.parse(fD);
        Date secondDate = sdf.parse(sD);
        int cnt = 1;

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.setTime(firstDate);
        end.setTime(secondDate);
        String[] vacDays = new String[] {"01-12-2017", "03-03-2017", "01-05-2017", "06-05-2017",
        "24-05-2017", "06-09-2017", "22-09-2017", "01-11-2017", "24-12-2017", "25-12-2017", "26-12-2017"};
        Date[] vacationDates = new Date[vacDays.length];
        for (int i = 0; i < vacDays.length; i++) {
            vacationDates[i] = sdf.parse(vacDays[i]);
        }

        while (start.getTime().before(end.getTime())) {
            Calendar temp = Calendar.getInstance();

            boolean isVacDay = false;


            for (Date d : vacationDates) {
                temp.setTime(d);
                if (start.get(Calendar.DAY_OF_WEEK) == 6 || start.get(Calendar.DAY_OF_WEEK) == 7) {
                    isVacDay = true;
                    break;
                }
                if (start.get(Calendar.DAY_OF_MONTH) == temp.get(Calendar.DAY_OF_MONTH)
                        && start.get(Calendar.MONTH) == temp.get(Calendar.MONTH)) {
                    isVacDay = true;
                    System.out.println("temp = " + temp.get(Calendar.MONTH));
                    System.out.println("start = " + start.get(Calendar.MONTH));
                    break;
                }
            }

            if (!isVacDay)
                cnt++;
            start.add(Calendar.DAY_OF_MONTH, 1);

        }

        System.out.printf("%d\n", cnt);
    }

}

class Point {
    public double x;
    public double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    public Point centre;
    public double radius;

    public Circle() {
        centre = new Point();
        radius = 0.0;
    }

    public void setCentre(Point centre) {
        this.centre.x = centre.x;
        this.centre.y = centre.y;
    }

    public Point getCentre() {
        return centre;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}

class Student {

    public List<Double> grades;
    public double averageGrade;
    public String name;

    public Student() {
        grades = new ArrayList<>();
        name = "";
        averageGrade = 0.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void calculateAverage() {
        double sum = 0.0;
        for (double number : this.grades) {
            sum += number;
        }
        this.averageGrade = sum / this.grades.size();
    }

}


