
import java.util.*;

class Swiggy {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\t\t\t Vanakkam Chennai");
        System.out.println("\t\t\t----------------------");
        System.out.println("please Select the Hotel");
        System.out.println("-------------------------");
        System.out.println("1. Hotel Saravana Bhavan\n2. Hotel Ananda Bhavan\n3. Hotel Aasai\n4. Hotel Sangeetha\n5. Hotel Adyar Ananda Bhavan");
        System.out.println("Enter your choice (1-5): ");
        int Hotel_Choice = s.nextInt();
        switch (Hotel_Choice) {
            case 1 -> {
                System.out.println("\t\t\tWelcome to Hotel Saravana Bhavan");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\tPlease wait while we load the menu...");
                Thread.sleep(2000);
                System.out.println("\t\t\tLoading menu...");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t1. Idli\t\t Rs: 10\n\t\t\t2. Dosa \t Rs: 20\n\t\t\t3. Pongal \t Rs: 30\n\t\t\t4. Vada \t Rs: 40\n\t\t\t5. Upma \t Rs: 50");
                System.out.println();
                int Item_Choice;
                while (true) {
                    System.out.print("\t\t\tPlease select an item from the menu by entering the corresponding number:");
                    Item_Choice = s.nextInt();
                    if (Item_Choice >= 1 && Item_Choice <= 5) {
                        break;
                    } else {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                switch (Item_Choice) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("\t\t\tYou have selected Idli.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.println("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 10 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Idli(s).");

                        System.out.println("\t\t\tPrice per Idli: 10 Rs");

                        System.out.println("\t\t\tTotal price: " + Qty * 10 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");

                        System.out.println("\t\t\tTotal amount: " + (Qty * 10 + GST) + " Rs");
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Dosa.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 20 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Dosa(s).");
                        System.out.println("\t\t\tPrice per Dosa: 20 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 20 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 20 + GST) + " Rs");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("\t\t\tYou have selected Pongal.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 30 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Pongal(s).");
                        System.out.println("\t\t\tPrice per Pongal: 30 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 30 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 30 + GST) + " Rs");
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("\t\t\tYou have selected Vada.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 40 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Vada(s).");
                        System.out.println("\t\t\tPrice per Vada: 40 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 40 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 40 + GST) + " Rs");
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("\t\t\tYou have selected Upma.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 50 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Upma(s).");
                        System.out.println("\t\t\tPrice per Upma: 50 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 50 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 50 + GST) + " Rs");
                        System.out.println();
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                System.out.println("\t\t\tSelect the payment method:");
                System.out.println("\t\t\t1. Cash on Delivery\n\t\t\t2. Online Payment");
                System.out.print("\t\t\tPlease enter your choice (1-2): ");
                System.out.println();
                System.out.println("\t\t\t-------------------------------");
                System.out.println();

                int Payment = s.nextInt();
                switch (Payment) {
                    case 1 -> {
                        System.out.println("\t\t\tYou have selected Cash on Delivery.");
                        System.out.println("\t\t\tPlease pay the total amount in cash to the delivery person.");
                        System.out.println("\t\t\tThank you for your order!");
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Online Payment.");
                        System.out.println("\t\t\tPlease complete the payment through your preferred online payment method.");
                        System.out.println("\t\t\t 1. UPI\n\t\t\t 2. Credit/Debit Card\n\t\t\t 3. Net Banking");
                        int Online_Payment = s.nextInt();
                        switch (Online_Payment) {
                            case 1 -> {
                                System.out.println("\t\t\tYou have selected UPI.");
                                System.out.println("\t\t\tPlease enter your UPI ID to complete the payment.");
                                System.out.println("\t\t\tExample: yourname@upi");
                                String upiId = s.next();
                                System.out.println("\t\t\tUPI ID: " + upiId);
                                int SYS_OTP = (int) (Math.random() * 100000);
                                System.out.println("\t\t\tOTP Processing....");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tYour OTP is: " + SYS_OTP);
                                System.out.println("\t\t\tAn OTP has been sent to your registered mobile number.");
                                int attempts = 0;
                                boolean success = false;
                                while (attempts < 3) {
                                    System.out.print("\t\t\tPlease Enter the otp to complete the payment: ");
                                    int User_OTP = s.nextInt();
                                    System.out.println("\t\t\tOTP: " + User_OTP);
                                    if (User_OTP == SYS_OTP) {
                                        success = true;
                                        break;
                                    } else {
                                        attempts++;
                                        if (attempts <= 3) {
                                            System.out.println("\t\t\tInvalid OTP. Please try again. (" + (3 - attempts) + " attempts left)");
                                        }
                                    }
                                }
                                if (!success) {
                                    System.out.println("\t\t\tInvalid OTP entered 3 times. Exiting the payment process.");
                                    return;
                                }
                                System.out.println("\t\t\tPlease wait while we process your payment...");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tPayment successful!");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 2 -> {
                                System.out.println("\t\t\tYou have selected Credit/Debit Card.");
                                System.out.println("\t\t\tPlease enter your card details to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 3 -> {
                                System.out.println("\t\t\tYou have selected Net Banking.");
                                System.out.println("\t\t\tPlease log in to your bank account to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            default -> {
                                System.out.println("\t\t\tInvalid online payment method. Please select a valid option.");
                            }
                        }
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid payment method. Please select a valid option.");
                    }
                }
            }
            case 2 -> {
                System.out.println("\t\t\tWelcome to Hotel Ananda Bhavan");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\tPlease wait while we load the menu...");
                Thread.sleep(2000);
                System.out.println("\t\t\tLoading menu...");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t1. Poori\t\tRs: 25\n\t\t\t2. Chappathi\tRs: 20\n\t\t\t3. Roti\t\tRs: 15\n\t\t\t4. Naan\t\tRs: 30\n\t\t\t5. Biryani\tRs: 60");
                System.out.println();
                int Item_Choice;
                while (true) {
                    System.out.print("\t\t\tPlease select an item from the menu by entering the corresponding number:");
                    Item_Choice = s.nextInt();
                    if (Item_Choice >= 1 && Item_Choice <= 5) {
                        break;
                    } else {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                switch (Item_Choice) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("\t\t\tYou have selected Poori.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.println("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 25 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Poori(s).");

                        System.out.println("\t\t\tPrice per Poori: 25 Rs");

                        System.out.println("\t\t\tTotal price: " + Qty * 25 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");

                        System.out.println("\t\t\tTotal amount: " + (Qty * 25 + GST) + " Rs");
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Chappathi.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 20 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Chappathi(s).");
                        System.out.println("\t\t\tPrice per Chappathi: 20 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 20 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 20 + GST) + " Rs");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("\t\t\tYou have selected Roti.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 15 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Roti(s).");
                        System.out.println("\t\t\tPrice per Roti: 15 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 15 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 15 + GST) + " Rs");
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("\t\t\tYou have selected Naan.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 30 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Naan(s).");
                        System.out.println("\t\t\tPrice per Naan: 30 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 30 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 30 + GST) + " Rs");
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("\t\t\tYou have selected Biryani.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 60 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Biryani(s).");
                        System.out.println("\t\t\tPrice per Biryani: 60 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 60 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 60 + GST) + " Rs");
                        System.out.println();
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                System.out.println("\t\t\tSelect the payment method:");
                System.out.println("\t\t\t1. Cash on Delivery\n\t\t\t2. Online Payment");
                System.out.print("\t\t\tPlease enter your choice (1-2): ");
                System.out.println();
                System.out.println("\t\t\t-------------------------------");
                System.out.println();

                int Payment = s.nextInt();
                switch (Payment) {
                    case 1 -> {
                        System.out.println("\t\t\tYou have selected Cash on Delivery.");
                        System.out.println("\t\t\tPlease pay the total amount in cash to the delivery person.");
                        System.out.println("\t\t\tThank you for your order!");
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Online Payment.");
                        System.out.println("\t\t\tPlease complete the payment through your preferred online payment method.");
                        System.out.println("\t\t\t 1. UPI\n\t\t\t 2. Credit/Debit Card\n\t\t\t 3. Net Banking");
                        int Online_Payment = s.nextInt();
                        switch (Online_Payment) {
                            case 1 -> {
                                System.out.println("\t\t\tYou have selected UPI.");
                                System.out.println("\t\t\tPlease enter your UPI ID to complete the payment.");
                                System.out.println("\t\t\tExample: yourname@upi");
                                String upiId = s.next();
                                System.out.println("\t\t\tUPI ID: " + upiId);
                                int SYS_OTP = (int) (Math.random() * 100000);
                                System.out.println("\t\t\tOTP Processing....");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tYour OTP is: " + SYS_OTP);
                                System.out.println("\t\t\tAn OTP has been sent to your registered mobile number.");
                                int attempts = 0;
                                boolean success = false;
                                while (attempts < 3) {
                                    System.out.print("\t\t\tPlease Enter the otp to complete the payment: ");
                                    int User_OTP = s.nextInt();
                                    System.out.println("\t\t\tOTP: " + User_OTP);
                                    if (User_OTP == SYS_OTP) {
                                        success = true;
                                        break;
                                    } else {
                                        attempts++;
                                        if (attempts <= 3) {
                                            System.out.println("\t\t\tInvalid OTP. Please try again. (" + (3 - attempts) + " attempts left)");
                                        }
                                    }
                                }
                                if (!success) {
                                    System.out.println("\t\t\tInvalid OTP entered 3 times. Exiting the payment process.");
                                    return;
                                }
                                System.out.println("\t\t\tPlease wait while we process your payment...");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tPayment successful!");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 2 -> {
                                System.out.println("\t\t\tYou have selected Credit/Debit Card.");
                                System.out.println("\t\t\tPlease enter your card details to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 3 -> {
                                System.out.println("\t\t\tYou have selected Net Banking.");
                                System.out.println("\t\t\tPlease log in to your bank account to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            default -> {
                                System.out.println("\t\t\tInvalid online payment method. Please select a valid option.");
                            }
                        }
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid payment method. Please select a valid option.");
                    }
                }
            }
            case 3 -> {
                System.out.println("\t\t\tWelcome to Hotel Aasai");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\tPlease wait while we load the menu...");
                Thread.sleep(2000);
                System.out.println("\t\t\tLoading menu...");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t1. Fried Rice\t\tRs: 50\n\t\t\t2. Noodles\t\tRs: 45\n\t\t\t3. Manchurian\t\tRs: 55\n\t\t\t4. Spring Roll\t\tRs: 40\n\t\t\t5. Chilli Paneer\tRs: 60");
                System.out.println();
                int Item_Choice;
                while (true) {
                    System.out.print("\t\t\tPlease select an item from the menu by entering the corresponding number:");
                    Item_Choice = s.nextInt();
                    if (Item_Choice >= 1 && Item_Choice <= 5) {
                        break;
                    } else {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                switch (Item_Choice) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("\t\t\tYou have selected Fried Rice.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.println("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 50 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Fried Rice(s).");

                        System.out.println("\t\t\tPrice per Fried Rice: 50 Rs");

                        System.out.println("\t\t\tTotal price: " + Qty * 50 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");

                        System.out.println("\t\t\tTotal amount: " + (Qty * 50 + GST) + " Rs");
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Noodles.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 45 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Noodles(s).");
                        System.out.println("\t\t\tPrice per Noodles: 45 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 45 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 45 + GST) + " Rs");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("\t\t\tYou have selected Manchurian.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 55 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Manchurian(s).");
                        System.out.println("\t\t\tPrice per Manchurian: 55 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 55 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 55 + GST) + " Rs");
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("\t\t\tYou have selected Spring Roll.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 40 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Spring Roll(s).");
                        System.out.println("\t\t\tPrice per Spring Roll: 40 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 40 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 40 + GST) + " Rs");
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("\t\t\tYou have selected Chilli Paneer.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 60 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Chilli Paneer(s).");
                        System.out.println("\t\t\tPrice per Chilli Paneer: 60 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 60 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 60 + GST) + " Rs");
                        System.out.println();
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                System.out.println("\t\t\tSelect the payment method:");
                System.out.println("\t\t\t1. Cash on Delivery\n\t\t\t2. Online Payment");
                System.out.print("\t\t\tPlease enter your choice (1-2): ");
                System.out.println();
                System.out.println("\t\t\t-------------------------------");
                System.out.println();

                int Payment = s.nextInt();
                switch (Payment) {
                    case 1 -> {
                        System.out.println("\t\t\tYou have selected Cash on Delivery.");
                        System.out.println("\t\t\tPlease pay the total amount in cash to the delivery person.");
                        System.out.println("\t\t\tThank you for your order!");
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Online Payment.");
                        System.out.println("\t\t\tPlease complete the payment through your preferred online payment method.");
                        System.out.println("\t\t\t 1. UPI\n\t\t\t 2. Credit/Debit Card\n\t\t\t 3. Net Banking");
                        int Online_Payment = s.nextInt();
                        switch (Online_Payment) {
                            case 1 -> {
                                System.out.println("\t\t\tYou have selected UPI.");
                                System.out.println("\t\t\tPlease enter your UPI ID to complete the payment.");
                                System.out.println("\t\t\tExample: yourname@upi");
                                String upiId = s.next();
                                System.out.println("\t\t\tUPI ID: " + upiId);
                                int SYS_OTP = (int) (Math.random() * 100000);
                                System.out.println("\t\t\tOTP Processing....");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tYour OTP is: " + SYS_OTP);
                                System.out.println("\t\t\tAn OTP has been sent to your registered mobile number.");
                                int attempts = 0;
                                boolean success = false;
                                while (attempts < 3) {
                                    System.out.print("\t\t\tPlease Enter the otp to complete the payment: ");
                                    int User_OTP = s.nextInt();
                                    System.out.println("\t\t\tOTP: " + User_OTP);
                                    if (User_OTP == SYS_OTP) {
                                        success = true;
                                        break;
                                    } else {
                                        attempts++;
                                        if (attempts <= 3) {
                                            System.out.println("\t\t\tInvalid OTP. Please try again. (" + (3 - attempts) + " attempts left)");
                                        }
                                    }
                                }
                                if (!success) {
                                    System.out.println("\t\t\tInvalid OTP entered 3 times. Exiting the payment process.");
                                    return;
                                }
                                System.out.println("\t\t\tPlease wait while we process your payment...");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tPayment successful!");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 2 -> {
                                System.out.println("\t\t\tYou have selected Credit/Debit Card.");
                                System.out.println("\t\t\tPlease enter your card details to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 3 -> {
                                System.out.println("\t\t\tYou have selected Net Banking.");
                                System.out.println("\t\t\tPlease log in to your bank account to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            default -> {
                                System.out.println("\t\t\tInvalid online payment method. Please select a valid option.");
                            }
                        }
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid payment method. Please select a valid option.");
                    }
                }
            }
            case 4 -> {
                System.out.println("\t\t\tWelcome to Hotel Sangeetha");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\tPlease wait while we load the menu...");
                Thread.sleep(2000);
                System.out.println("\t\t\tLoading menu...");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t1. Masala Dosa\t\tRs: 35\n\t\t\t2. Butter Naan\t\tRs: 30\n\t\t\t3. Paneer Tikka\t\tRs: 70\n\t\t\t4. Chole Bhature\tRs: 50\n\t\t\t5. Pulao\t\tRs: 55");
                System.out.println();
                int Item_Choice;
                while (true) {
                    System.out.print("\t\t\tPlease select an item from the menu by entering the corresponding number:");
                    Item_Choice = s.nextInt();
                    if (Item_Choice >= 1 && Item_Choice <= 5) {
                        break;
                    } else {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                switch (Item_Choice) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("\t\t\tYou have selected Masala Dosa.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.println("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 35 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Masala Dosa(s).");

                        System.out.println("\t\t\tPrice per Masala Dosa: 35 Rs");

                        System.out.println("\t\t\tTotal price: " + Qty * 35 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");

                        System.out.println("\t\t\tTotal amount: " + (Qty * 35 + GST) + " Rs");
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Butter Naan.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 30 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Butter Naan(s).");
                        System.out.println("\t\t\tPrice per Butter Naan: 30 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 30 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 30 + GST) + " Rs");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("\t\t\tYou have selected Paneer Tikka.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 70 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Paneer Tikka(s).");
                        System.out.println("\t\t\tPrice per Paneer Tikka: 70 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 70 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 70 + GST) + " Rs");
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("\t\t\tYou have selected Chole Bhature.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 50 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Chole Bhature(s).");
                        System.out.println("\t\t\tPrice per Chole Bhature: 50 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 50 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 50 + GST) + " Rs");
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("\t\t\tYou have selected Pulao.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 55 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Pulao(s).");
                        System.out.println("\t\t\tPrice per Pulao: 55 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 55 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 55 + GST) + " Rs");
                        System.out.println();
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                System.out.println("\t\t\tSelect the payment method:");
                System.out.println("\t\t\t1. Cash on Delivery\n\t\t\t2. Online Payment");
                System.out.print("\t\t\tPlease enter your choice (1-2): ");
                System.out.println();
                System.out.println("\t\t\t-------------------------------");
                System.out.println();

                int Payment = s.nextInt();
                switch (Payment) {
                    case 1 -> {
                        System.out.println("\t\t\tYou have selected Cash on Delivery.");
                        System.out.println("\t\t\tPlease pay the total amount in cash to the delivery person.");
                        System.out.println("\t\t\tThank you for your order!");
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Online Payment.");
                        System.out.println("\t\t\tPlease complete the payment through your preferred online payment method.");
                        System.out.println("\t\t\t 1. UPI\n\t\t\t 2. Credit/Debit Card\n\t\t\t 3. Net Banking");
                        int Online_Payment = s.nextInt();
                        switch (Online_Payment) {
                            case 1 -> {
                                System.out.println("\t\t\tYou have selected UPI.");
                                System.out.println("\t\t\tPlease enter your UPI ID to complete the payment.");
                                System.out.println("\t\t\tExample: yourname@upi");
                                String upiId = s.next();
                                System.out.println("\t\t\tUPI ID: " + upiId);
                                int SYS_OTP = (int) (Math.random() * 100000);
                                System.out.println("\t\t\tOTP Processing....");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tYour OTP is: " + SYS_OTP);
                                System.out.println("\t\t\tAn OTP has been sent to your registered mobile number.");
                                int attempts = 0;
                                boolean success = false;
                                while (attempts < 3) {
                                    System.out.print("\t\t\tPlease Enter the otp to complete the payment: ");
                                    int User_OTP = s.nextInt();
                                    System.out.println("\t\t\tOTP: " + User_OTP);
                                    if (User_OTP == SYS_OTP) {
                                        success = true;
                                        break;
                                    } else {
                                        attempts++;
                                        if (attempts <= 3) {
                                            System.out.println("\t\t\tInvalid OTP. Please try again. (" + (3 - attempts) + " attempts left)");
                                        }
                                    }
                                }
                                if (!success) {
                                    System.out.println("\t\t\tInvalid OTP entered 3 times. Exiting the payment process.");
                                    return;
                                }
                                System.out.println("\t\t\tPlease wait while we process your payment...");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tPayment successful!");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 2 -> {
                                System.out.println("\t\t\tYou have selected Credit/Debit Card.");
                                System.out.println("\t\t\tPlease enter your card details to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 3 -> {
                                System.out.println("\t\t\tYou have selected Net Banking.");
                                System.out.println("\t\t\tPlease log in to your bank account to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            default -> {
                                System.out.println("\t\t\tInvalid online payment method. Please select a valid option.");
                            }
                        }
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid payment method. Please select a valid option.");
                    }
                }
            }
            case 5 -> {
                System.out.println("\t\t\tWelcome to Hotel Adyar Ananda Bhavan");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\tPlease wait while we load the menu...");
                Thread.sleep(2000);
                System.out.println("\t\t\tLoading menu...");
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t1. Filter Coffee\tRs: 20\n\t\t\t2. Masala Tea\t\tRs: 15\n\t\t\t3. Lemon Juice\t\tRs: 25\n\t\t\t4. Badam Milk\t\tRs: 30\n\t\t\t5. Lassi\t\tRs: 25");
                System.out.println();
                int Item_Choice;
                while (true) {
                    System.out.print("\t\t\tPlease select an item from the menu by entering the corresponding number:");
                    Item_Choice = s.nextInt();
                    if (Item_Choice >= 1 && Item_Choice <= 5) {
                        break;
                    } else {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                switch (Item_Choice) {
                    case 1 -> {
                        System.out.println();
                        System.out.println("\t\t\tYou have selected Filter Coffee.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.println("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 20 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Filter Coffee(s).");

                        System.out.println("\t\t\tPrice per Filter Coffee: 20 Rs");

                        System.out.println("\t\t\tTotal price: " + Qty * 20 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");

                        System.out.println("\t\t\tTotal amount: " + (Qty * 20 + GST) + " Rs");
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Masala Tea.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 15 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Masala Tea(s).");
                        System.out.println("\t\t\tPrice per Masala Tea: 15 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 15 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 15 + GST) + " Rs");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("\t\t\tYou have selected Lemon Juice.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 25 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Lemon Juice(s).");
                        System.out.println("\t\t\tPrice per Lemon Juice: 25 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 25 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 25 + GST) + " Rs");
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("\t\t\tYou have selected Badam Milk.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 30 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Badam Milk(s).");
                        System.out.println("\t\t\tPrice per Badam Milk: 30 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 30 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 30 + GST) + " Rs");
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("\t\t\tYou have selected Lassi.");
                        System.out.println();
                        int Qty;
                        while (true) {
                            System.out.print("\t\t\tPlease select the quantity:");
                            Qty = s.nextInt();
                            if (Qty > 0) {
                                break;
                            } else {
                                System.out.print("\t\t\tInvalid quantity. Please enter a positive number.");
                                System.out.println();
                            }
                        }
                        System.out.println("\t\t\tPlease wait while we calculate the total amount...");
                        System.out.println("\t\t\t-------------------------------");
                        System.out.println();
                        Thread.sleep(3000);
                        int GST = (int) (Qty * 25 * 0.18);
                        System.out.println("\t\t\tYou have selected " + Qty + " Lassi(s).");
                        System.out.println("\t\t\tPrice per Lassi: 25 Rs");
                        System.out.println("\t\t\tTotal price: " + Qty * 25 + " Rs");
                        System.out.println("\t\t\tGST (18%): " + GST + " Rs");
                        System.out.println("\t\t\tTotal amount: " + (Qty * 25 + GST) + " Rs");
                        System.out.println();
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid choice. Please select a valid item.");
                        System.out.println();
                    }
                }
                System.out.println("\t\t\tSelect the payment method:");
                System.out.println("\t\t\t1. Cash on Delivery\n\t\t\t2. Online Payment");
                System.out.print("\t\t\tPlease enter your choice (1-2): ");
                System.out.println();
                System.out.println("\t\t\t-------------------------------");
                System.out.println();

                int Payment = s.nextInt();
                switch (Payment) {
                    case 1 -> {
                        System.out.println("\t\t\tYou have selected Cash on Delivery.");
                        System.out.println("\t\t\tPlease pay the total amount in cash to the delivery person.");
                        System.out.println("\t\t\tThank you for your order!");
                    }
                    case 2 -> {
                        System.out.println("\t\t\tYou have selected Online Payment.");
                        System.out.println("\t\t\tPlease complete the payment through your preferred online payment method.");
                        System.out.println("\t\t\t 1. UPI\n\t\t\t 2. Credit/Debit Card\n\t\t\t 3. Net Banking");
                        int Online_Payment = s.nextInt();
                        switch (Online_Payment) {
                            case 1 -> {
                                System.out.println("\t\t\tYou have selected UPI.");
                                System.out.println("\t\t\tPlease enter your UPI ID to complete the payment.");
                                System.out.println("\t\t\tExample: yourname@upi");
                                String upiId = s.next();
                                System.out.println("\t\t\tUPI ID: " + upiId);
                                int SYS_OTP = (int) (Math.random() * 100000);
                                System.out.println("\t\t\tOTP Processing....");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tYour OTP is: " + SYS_OTP);
                                System.out.println("\t\t\tAn OTP has been sent to your registered mobile number.");
                                int attempts = 0;
                                boolean success = false;
                                while (attempts < 3) {
                                    System.out.print("\t\t\tPlease Enter the otp to complete the payment: ");
                                    int User_OTP = s.nextInt();
                                    System.out.println("\t\t\tOTP: " + User_OTP);
                                    if (User_OTP == SYS_OTP) {
                                        success = true;
                                        break;
                                    } else {
                                        attempts++;
                                        if (attempts <= 3) {
                                            System.out.println("\t\t\tInvalid OTP. Please try again. (" + (3 - attempts) + " attempts left)");
                                        }
                                    }
                                }
                                if (!success) {
                                    System.out.println("\t\t\tInvalid OTP entered 3 times. Exiting the payment process.");
                                    return;
                                }
                                System.out.println("\t\t\tPlease wait while we process your payment...");
                                Thread.sleep(2000);
                                System.out.println("\t\t\tPayment successful!");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 2 -> {
                                System.out.println("\t\t\tYou have selected Credit/Debit Card.");
                                System.out.println("\t\t\tPlease enter your card details to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            case 3 -> {
                                System.out.println("\t\t\tYou have selected Net Banking.");
                                System.out.println("\t\t\tPlease log in to your bank account to complete the payment.");
                                System.out.println("\t\t\tThank you for your order!");
                            }
                            default -> {
                                System.out.println("\t\t\tInvalid online payment method. Please select a valid option.");
                            }
                        }
                    }
                    default -> {
                        System.out.println("\t\t\tInvalid payment method. Please select a valid option.");
                    }
                }
            }
            default -> {
                System.out.println("Invalid choice. Please select a valid hotel.");
                main(args);
            }
        }

    }

}
