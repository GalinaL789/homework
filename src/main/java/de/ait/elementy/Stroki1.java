package de.ait.elementy;

import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stroki1                                                             {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        String str1 = "";
        int ji = 0;
        try {
            File myObj = new File("U2.dat");
            Scanner x = new Scanner(myObj);
            while (x.hasNext()) {
                str1 = x.nextLine();
                // String str1="1, 2, 3";

                ji = ji + 1;
//             System.out.println(ji);
//            System.out.println("_________________________________________");
                String str2 = "";
                try {
                    File myObj1 = new File("ELEMENTS_ALL.dat");
                    Scanner y = new Scanner(myObj1);
//      int kj=0;
                    while (y.hasNext()) {
                        str2 = y.nextLine();
//               kj=kj+1;
//               System.out.println(kj);
                        String[] nums1 = str1.split(",");
                        String[] nums1s = new String[nums1.length];
                        String[] nums2 = str2.split(",");
//                System.out.println(nums2.length);

                        String[] num3 = new String[4];

                        for (int i = 0; i < nums1.length; i++) {
                            nums1s[i] = nums1[i];
                        }
                        Arrays.sort(nums1);
//             System.out.println(nums1[0] + nums1[1] + nums1[2]);
                        Arrays.sort(nums2, 1, 5);
                        for (int i = 0; i < num3.length; i++) {
                            num3[i] = nums2[i + 1];
//                    System.out.println(num3[i]);
                        }
                        arrayList.clear();
                        for (int i = 0; i < nums1.length; i++) {
                            for (int j = 0; j < num3.length; j++) {
                                if (num3[j].trim().equals(nums1[i].trim())) {
                                    arrayList.add(nums1[i]);
                                }
                            }
                        }
//                System.out.println(arrayList);
                        int kkk = 0;
                        arrayList1.clear();
                        for (int k = 0; k < num3.length; k++) {
                            for (int j = 0; j < nums1.length; j++) {
                                if (num3[k].trim().equals(nums1[j].trim())) {
                                    kkk = kkk + 1;
                                    arrayList1.add(k);
                                }
                            }
                        }

//                System.out.println(arrayList1);
                        int sum = 0;
                        for (int i = 0; i < arrayList1.size(); i++) {
                            sum += arrayList1.get(i);
                        }

                        int aaa = 0;
                        switch (sum) {
                            case 6:
                                aaa = 0;
                                break;
                            case 5:
                                aaa = 1;
                                break;
                            case 3:
                                aaa = 3;
                                break;
                            case 4:
                                aaa = 2;
                                break;
                        }

                        if (kkk == 3) {
//System.out.println("___________________________________________________________________");
                            String result = nums2[0] + ", " + nums1s[0] + ", " + nums1s[1] + ", " + nums1s[2] + ", " + num3[aaa];
//                    System.out.println(result);
                            System.out.printf("%s,", nums2[0]);
//System.out.println("_________________________________________________________________");
                        }

//else
//{
//break;
//}

                    }
                    y.close();
                } catch (Exception e) {
                    System.out.println("could not first file");
                }

            }
            x.close();
        } catch (Exception e) {
            System.out.println("could not find second file");
        }
    }
    }
//                 try{
//      y=new Scanner(new File("ELEMENTS_ALL.dat"));
//      }
//     catch (Exception e)
//    {
//    System.out.println("could not find file");
//}
        //  while (y.hasNext()) {
//                    String str2 = y.nextLine();
//                   String str2="5,1,2,3,8";

//else {
//                    break;
//                }

