/**
 * @param monthNumber Month Number starts with 0. For <b>January</b> it is <b>0</b> and for <b>December</b> it is <b>11</b>.
 * @param year
 * @return
 */
 public static int getDaysInMonth(int monthNumber,int year)
 {
 int days=0;
 if(monthNumber>=0 && monthNumber<12){
 try
 {
 Calendar calendar = Calendar.getInstance();
 int date = 1;
 calendar.set(year, monthNumber, date);
 days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
 } catch (Exception e)
 {
 if(e!=null)
 e.printStackTrace();
 }
 }
 return days;
 }