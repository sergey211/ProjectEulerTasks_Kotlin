import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt

fun main() 
{
var sdf = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
var datetime = sdf.format(Date())
println(datetime) 
// https://www.techiedelight.com/ru/find-current-date-and-time-in-kotlin/
var sum: Int = 0
var maxCh: Int = 0
var diapazon = 50000
Runtime.getRuntime().exec("sound1.bat")
var treugChis = Array<Int>(diapazon,{0})
for (i in 1..diapazon-1)
    {
	sum = sum+i
	treugChis[i] = sum
    var counter: Int = 0 // 1
	for(j in i downTo 1)
	    {
		if (i%j==0)
		    {
			counter=counter+1
			}
		}
	}
println("diapazon $diapazon poschitan")
datetime = sdf.format(Date())
println(datetime) 
for (i in treugChis.indices)
    {
    var counter: Int = 0 // 1
	var predel: Int = (treugChis[i]/2)+1
//	var predel: Int = (treugChis[i])
	for(j in predel downTo 1)
	    {
		//counter = 0 // error
		if (treugChis[i]%j==0)
		    {
			// counter++
			counter=counter+1
			}
		}
    //print(treugChis[i])	
	if ((counter>maxCh)and(treugChis[i]>1))
		{
		maxCh=counter+1
		print("u chisla ")
		print(treugChis[i]) 
		var itogo = counter+1
		println(" deliteley = $itogo ") // +1
	//	println(" deliteley = $counter ") 
	//println("$i $sum $counter")
		}
/*	if (maxCh>450)
		{
		print("!DELITELEY = $maxCh , CHISLO = ")
		println(treugChis[i])
	    datetime = sdf.format(Date())
        println(datetime) 
	//	Runtime.getRuntime().exec("sound1.bat")
	//	Thread.sleep(2_000)
		}
*/	if (maxCh>500)
		{
		print("!FOUND DELITELEY = $maxCh , CHISLO = ")
		println(treugChis[i])
	    datetime = sdf.format(Date())
        println(datetime) 
		Runtime.getRuntime().exec("sound1.bat")
		Thread.sleep(2_000)
		Runtime.getRuntime().exec("sound1.bat")
		Thread.sleep(2_000)
		Runtime.getRuntime().exec("sound1.bat")
		Thread.sleep(2_000)
		break
		}	
	}
}

// u chisla 17907120 deliteley = 480 // 5 min
// FOUND DELITELEY = 576 , CHISLO = 76576500