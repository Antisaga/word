# word
<p> This script helps you to click caps lock / f15 </p>

<p> Execution:  java -jar ./target/my-project-name-jar-with-dependencies.jar [param0] [param1] [param2] </p>

<p> [param0] - time in miliseconds, example 60000 for 1 minute </p>
<p> [param1] - mode, example  0 = f15, 1 = comma, 2 = caps </p>
<p> [param2] - max time, for how long to run the app, example 3600000 for 1 hour </p>

<p> Example:

 <p> mvn clean package </p>
 <p> java -jar ./target/my-project-name-jar-with-dependencies.jar 900000 0 28800000 </p>

 <p> This example will create fat jar in target folder and after execution click on F15 every 15 minutes for 8 hours. Enjoy) </p>


