<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Train">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the TrainCar superclass."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.TrainCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the TrainCar class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.TrainCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the CargoCar class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CargoCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the CargoCar class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CargoCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the PassengerCar class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.PassengerCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the PassengerCar class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.PassengerCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the Train class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.Train"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the Train class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.Train"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the TrainCarTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.TrainCarTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the PassengerCarTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.PassengerCarTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CargoCarTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.CargoCarTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the TrainTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.TrainTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code in *Car classes."/>
        <a xsi:type="workbench:DebugEventAnswer" elementId="inheritance.*Car" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code in the Train class."/>
        <a xsi:type="workbench:DebugEventAnswer" elementId="inheritance.Train" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Over"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepOver" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Into"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepInto" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the Variables view"/>
        <a xsi:type="workbench:PartTaskAnswer" elementId="org.eclipse.debug.ui.VariableView" action="activated"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788231934" sizeMeasure="23">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class TrainCar {&#xA;&#x9;int deadWeight;&#xA;&#x9;public TrainCar(int deadWeight){&#xA;&#x9;&#x9;this.deadWeight = deadWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;return 0;&#xA;&#x9;}&#xA;&#x9;public void setDeadWeight(int deadWeight){&#xA;&#x9;this.deadWeight=deadWeight;&#x9;&#xA;&#x9;}&#xA;&#x9;public int getDeadWeight(){&#xA;&#x9;&#x9;return this.deadWeight;&#xA;&#x9;}&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;TrainCar tc = new TrainCar(4000);&#xA;&#x9;&#x9;tc.setDeadWeight(5000);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788974318" sizeMeasure="25">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="private int deadWeight;&#xA;&#x9;private int totalWeight;&#xA;&#x9;public TrainCar(int deadWeight){&#xA;&#x9;&#x9;this.deadWeight = deadWeight;&#xA;&#x9;&#x9;this.totalWeight =deadWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;return totalWeight" edit="/1/@proposals.0/@proposals.0/@attempts.0/@edit" start="47" end="-253"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490789194299" sizeMeasure="25">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="otected int deadWeight;&#xA;&#xA;&#x9;public TrainCar(int deadWeight){&#xA;&#x9;&#x9;this.deadWeight = deadWeight;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;return dead" edit="/1/@proposals.0/@proposals.0/@attempts.1/@edit" start="49" end="-259"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490789676922" sizeMeasure="25">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.0/@proposals.0/@attempts.2/@edit" start="449" end="-450"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a"/>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490787413320" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CargoCar {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490787742859" sizeMeasure="19">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="extends TrainCar{&#xA;&#xA;&#x9;private int load;&#xA;&#xA;&#x9;public CargoCar(int deadWeight,int load) {&#xA;&#x9;&#x9;super(deadWeight);&#xA;&#x9;&#x9;this.load=load;&#xA;&#x9;&#x9;// TODO Auto-generated constructor stub&#xA;&#x9;}&#xA;&#x9;public int getCargoWeight(){&#xA;&#x9;&#x9;return this.load;&#xA;&#x9;}&#xA;&#x9;public void setCargoWeight(int load){&#xA;&#x9;&#x9;this.load=load;&#xA;&#x9;}" edit="/1/@proposals.0/@proposals.2/@attempts.0/@edit" start="44" end="-5"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788323345" sizeMeasure="19">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString=" + this.deadWeight" edit="/1/@proposals.0/@proposals.2/@attempts.1/@edit" start="259" end="-69"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788469661" sizeMeasure="19">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.0/@proposals.2/@attempts.2/@edit" start="259" end="-69"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788554104" sizeMeasure="24">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;CargoCar cc = new CargoCar(2000,4000);&#xA;&#x9;&#x9;cc.setCargoWeight(5000);&#xA;&#x9;&#x9;System.out.println(cc.getCargoWeight())" edit="/1/@proposals.0/@proposals.2/@attempts.3/@edit" start="324" end="-9"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788591618" sizeMeasure="26">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="cc.setDeadWeight(1000);&#xA;&#x9;&#x9;System.out.println(cc.getCargoWeight());&#xA;&#x9;&#x9;System.out.println(cc.getDead" edit="/1/@proposals.0/@proposals.2/@attempts.4/@edit" start="436" end="-18"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490789194287" sizeMeasure="30">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="@Override &#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;return this.load +this.deadWeight" edit="/1/@proposals.0/@proposals.2/@attempts.5/@edit" start="325" end="-233"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.0/@tasks.3/@q" answer="/0/@parts.0/@tasks.3/@a">
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490788554014" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490788591491" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490788865042" mode="run"/>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.4/@q" answer="/0/@parts.0/@tasks.4/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490787755000" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class PassengerCar {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490788216988" sizeMeasure="20">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="extends TrainCar {&#xA;&#xA;&#x9;private int passengerCount;&#xA;&#xA;&#x9;public PassengerCar(int deadWeight, int numberOfPassengers) {&#xA;&#x9;&#x9;super(deadWeight);&#xA;&#x9;&#x9;this.passengerCount=numberOfPassengers;&#xA;&#x9;&#x9;// TODO Auto-generated constructor stub&#xA;&#x9;}&#xA;&#xA;&#x9;public int getPassengerCount(){&#xA;&#x9;&#x9;return passengerCount;&#xA;&#x9;}&#xA;&#x9;public void setPassengerCount(int passengers){&#xA;&#x9;&#x9;this.passengerCount=passengers;&#xA;&#x9;&#x9;// Avg. 80kg&#xA;&#x9;}" edit="/1/@proposals.0/@proposals.4/@attempts.0/@edit" start="48" end="-4"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490789669909" sizeMeasure="24">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="@Override &#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;return this.deadWeight + this.passengerCount*80;&#xA;&#x9;}" edit="/1/@proposals.0/@proposals.4/@attempts.1/@edit" start="271" end="-165"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.0/@tasks.5/@q" answer="/0/@parts.0/@tasks.5/@a"/>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.6/@q" answer="/0/@parts.0/@tasks.6/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490789775525" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class Train {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490790343120" sizeMeasure="8">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="&#x9;public void addTrainCar(TrainCar trainCar){&#xA;&#x9;&#x9;&#xA;&#x9;}" edit="/1/@proposals.0/@proposals.6/@attempts.0/@edit" start="44" end="-4"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490792606379" sizeMeasure="71">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="import java.util.ArrayList;&#xA;import java.util.List;&#xA;&#xA;public class Train {&#xA;&#x9;List&lt;TrainCar> trainCars=new ArrayList&lt;>();&#xA;&#x9;&#xA;&#x9;public Train(List&lt;TrainCar> trainCars){&#xA;&#x9;&#x9;this.trainCars=trainCars;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void addTrainCar(TrainCar trainCar){&#xA;&#x9;&#x9;this.trainCars.add(trainCar);&#xA;&#x9;}&#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;int totalWeight=0;&#xA;&#x9;&#x9;for(int i=0;i&lt;this.trainCars.size();i++){&#xA;&#x9;&#x9;&#x9;totalWeight+=this.trainCars.get(i).getTotalWeight();&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalWeight;&#xA;&#x9;}&#xA;&#x9;public boolean contains(TrainCar traincar){&#xA;&#x9;&#x9;return this.contains(traincar);&#xA;&#x9;}&#xA;&#x9;public int getPassengerCount(){&#xA;&#x9;&#x9;int totalPassengers=0;&#xA;&#x9;&#x9;for(int i=0;i&lt;this.trainCars.size();i++){&#xA;&#x9;&#x9;&#x9;if(this.trainCars.get(i) instanceof PassengerCar){&#xA;&#x9;&#x9;&#x9;&#x9;totalPassengers+=((PassengerCar)this.trainCars.get(i)).getPassengerCount();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalPassengers;&#xA;&#x9;}&#xA;&#x9;public int getCargoWeight(){&#xA;&#x9;&#x9;int totalLoad=0;&#xA;&#x9;&#x9;for(int i=0;i&lt;this.trainCars.size();i++){&#xA;&#x9;&#x9;&#x9;if(this.trainCars.get(i) instanceof CargoCar){&#xA;&#x9;&#x9;&#x9;&#x9;totalLoad+=((CargoCar)this.trainCars.get(i)).getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalLoad;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public String toString(){&#xA;&#x9;&#x9;String infoString=&quot;The Train contains:&quot;;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;int trainLength=this.trainCars.size();&#xA;&#x9;&#x9;for(int i=0;i&lt;trainLength;i++){&#xA;&#x9;&#x9;&#x9;if(this.trainCars.get(i) instanceof PassengerCar){&#xA;&#x9;&#x9;&#x9;&#x9;String typeOfCar=&quot;Passenger Car&quot;;&#xA;&#x9;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;&#x9;&#x9;int passengers=((PassengerCar)this.trainCars.get(i)).getPassengerCount();&#xA;&#x9;&#x9;&#x9;&#x9;int deadWeight=this.trainCars.get(i).getDeadWeight();&#xA;&#x9;&#x9;&#x9;&#x9;int totalWeight=((PassengerCar)this.trainCars.get(i)).getTotalWeight();&#xA;&#x9;&#x9;&#x9;&#x9;infoString+=&quot;\nAt slot: &quot;+i+&quot;.\n A traincar of type: &quot;+typeOfCar+&quot;.\nDeadWeight: &quot;+deadWeight+&quot;.\nPassengers: &quot;+passengers+&quot;.\nTotal weight: &quot;+totalWeight+&quot;.&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(this.trainCars.get(i) instanceof CargoCar){&#xA;&#x9;&#x9;&#x9;&#x9;String typeOfCar=&quot;Cargo Car&quot;;&#xA;&#x9;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;&#x9;&#x9;int cargoLoad=((CargoCar)this.trainCars.get(i)).getCargoWeight();&#xA;&#x9;&#x9;&#x9;&#x9;int deadWeight=this.trainCars.get(i).getDeadWeight();&#xA;&#x9;&#x9;&#x9;&#x9;int totalWeight=((CargoCar)this.trainCars.get(i)).getTotalWeight();&#xA;&#x9;&#x9;&#x9;&#x9;infoString+=&quot;\nAt slot: &quot;+i+&quot;.\n A traincar of type: &quot;+typeOfCar+&quot;.\nDeadWeight: &quot;+deadWeight+&quot;.\nCargo load: &quot;+cargoLoad+&quot;.\nTotal weight: &quot;+totalWeight+&quot;.&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return infoString;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;" edit="/1/@proposals.0/@proposals.6/@attempts.1/@edit" start="22" end="-4"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490792743286" sizeMeasure="71">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString=";&#xA;&#x9;&#xA;&#x9;public Train(){&#xA;&#x9;&#x9;this.trainCars = new ArrayList&lt;>()" edit="/1/@proposals.0/@proposals.6/@attempts.2/@edit" start="120" end="-1995"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490792935116" sizeMeasure="73">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="if(!trainCars.contains(trainCar)){&#xA;&#x9;&#x9;&#x9;this.trainCars.add(trainCar);&#xA;&#x9;&#x9;}" edit="/1/@proposals.0/@proposals.6/@attempts.3/@edit" start="231" end="-1912"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793210263" sizeMeasure="78">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="public static void main(String[] args) {&#xA;&#x9;&#x9;Train t = new Train();&#xA;&#x9;&#x9;TrainCar tc = new TrainCar(4000);&#xA;&#x9;&#x9;t.addTrainCar(tc);&#xA;&#x9;&#x9;&#xA;&#x9;}" edit="/1/@proposals.0/@proposals.6/@attempts.4/@edit" start="2210" end="-4"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793245205" sizeMeasure="78">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="PassengerCar pc = new PassengerCar(4000,60);&#xA;&#x9;&#x9;t.addTrainCar(p" edit="/1/@proposals.0/@proposals.6/@attempts.5/@edit" start="2278" end="-13"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793254761" sizeMeasure="79">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="System.out.println" edit="/1/@proposals.0/@proposals.6/@attempts.6/@edit" start="2346" end="-15"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793278056" sizeMeasure="79">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="t" edit="/1/@proposals.0/@proposals.6/@attempts.7/@edit" start="2365" end="-12"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793302887" sizeMeasure="79">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.0/@proposals.6/@attempts.8/@edit" start="2046" end="-331"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793339871" sizeMeasure="79">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString=" " edit="/1/@proposals.0/@proposals.6/@attempts.9/@edit" start="2053" end="-324"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793382504" sizeMeasure="81">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="CargoCar cc = new CargoCar(3000,5000);&#xA;&#x9;&#x9;PassengerCar pc = new PassengerCar(4000,60);&#xA;&#x9;&#x9;t.addTrainCar(pc);&#xA;&#x9;&#x9;t.addTrainCar(c" edit="/1/@proposals.0/@proposals.6/@attempts.10/@edit" start="2278" end="-38"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793578349" sizeMeasure="81">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="contains(trainCar)){&#xA;&#x9;&#x9;&#x9;this.trainCars.add(trainCar);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;int totalWeight=0;&#xA;&#x9;&#x9;for(int i=0;i&lt;this.trainCars.size();i++){&#xA;&#x9;&#x9;&#x9;totalWeight+=this.trainCars.get(i).getTotalWeight();&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalWeight;&#xA;&#x9;}&#xA;&#x9;public boolean contains(TrainCar trainCar){&#xA;&#x9;&#x9;return this.contains(trainC" edit="/1/@proposals.0/@proposals.6/@attempts.11/@edit" start="235" end="-1880"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490793640632" sizeMeasure="81">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="trainCars.contains(trainCar)){&#xA;&#x9;&#x9;&#x9;this.trainCars.add(trainCar);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;public int getTotalWeight(){&#xA;&#x9;&#x9;int totalWeight=0;&#xA;&#x9;&#x9;for(int i=0;i&lt;this.trainCars.size();i++){&#xA;&#x9;&#x9;&#x9;totalWeight+=this.trainCars.get(i).getTotalWeight();&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalWeight;&#xA;&#x9;}&#xA;&#x9;public boolean contains(TrainCar trainCar){&#xA;&#x9;&#x9;return this.trainCar" edit="/1/@proposals.0/@proposals.6/@attempts.12/@edit" start="235" end="-1897"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.0/@tasks.7/@q" answer="/0/@parts.0/@tasks.7/@a">
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793210178" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793245167" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793254708" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793278014" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793303842" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793341391" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490793382469" mode="run"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.8/@q" answer="/0/@parts.0/@tasks.8/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490787093060" completion="1.0" successCount="1">
          <successTests>testCheckWeight</successTests>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.9/@q" answer="/0/@parts.0/@tasks.9/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490788750858" completion="0.0" failureCount="1">
          <failureTests>testCheckWeight</failureTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490789677206" completion="1.0" successCount="1">
          <successTests>testCheckWeight</successTests>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.10/@q" answer="/0/@parts.0/@tasks.10/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490788232874" completion="0.0" failureCount="1">
          <failureTests>testCheckWeight</failureTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490788323687" completion="0.0" failureCount="1">
          <failureTests>testCheckWeight</failureTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490788599577" completion="0.0" failureCount="1">
          <failureTests>testCheckWeight</failureTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490788837218" completion="0.0" failureCount="1">
          <failureTests>testCheckWeight</failureTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490789194611" completion="1.0" successCount="1">
          <successTests>testCheckWeight</successTests>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.11/@q" answer="/0/@parts.0/@tasks.11/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490792606874" completion="0.0" errorCount="4">
          <errorTests>testCheckTotalTrainWeight</errorTests>
          <errorTests>testCheckCargoWeight</errorTests>
          <errorTests>testCheckPassengerCount</errorTests>
          <errorTests>testAddCarToTrain</errorTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490792743617" completion="0.75" successCount="3" errorCount="1">
          <successTests>testCheckTotalTrainWeight</successTests>
          <successTests>testCheckCargoWeight</successTests>
          <successTests>testCheckPassengerCount</successTests>
          <errorTests>testAddCarToTrain</errorTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490792939860" completion="0.75" successCount="3" errorCount="1">
          <successTests>testCheckTotalTrainWeight</successTests>
          <successTests>testCheckCargoWeight</successTests>
          <successTests>testCheckPassengerCount</successTests>
          <errorTests>testAddCarToTrain</errorTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490793352502" completion="0.75" successCount="3" errorCount="1">
          <successTests>testCheckTotalTrainWeight</successTests>
          <successTests>testCheckCargoWeight</successTests>
          <successTests>testCheckPassengerCount</successTests>
          <errorTests>testAddCarToTrain</errorTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490793584278" completion="0.0" errorCount="4">
          <errorTests>testCheckTotalTrainWeight</errorTests>
          <errorTests>testCheckCargoWeight</errorTests>
          <errorTests>testCheckPassengerCount</errorTests>
          <errorTests>testAddCarToTrain</errorTests>
        </attempts>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490793647342" completion="1.0" successCount="4">
          <successTests>testCheckTotalTrainWeight</successTests>
          <successTests>testCheckCargoWeight</successTests>
          <successTests>testCheckPassengerCount</successTests>
          <successTests>testAddCarToTrain</successTests>
        </attempts>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a"/>
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a"/>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.4/@q" answer="/0/@parts.1/@tasks.4/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
