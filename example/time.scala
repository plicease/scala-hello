class Time(hrs:Int, min:Int) {

  if(hrs < 0 || hrs > 23)
    throw new Exception("Hours must be between 0 and 23");

  if(min < 0 || min > 59)
    throw new Exception("Minutes must be between 0 and 59");

  private val hours = hrs
  private val minutes = min

  def before(other: Time) = {
    if(other.hours > hours)
      true
    else if(other.hours < hours)
      false
    else
      other.minutes > minutes
  }

  override def toString() = "%02d:%02d".format(hours, minutes)

}
