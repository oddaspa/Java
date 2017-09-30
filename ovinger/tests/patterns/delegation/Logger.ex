<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Logger">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the ILogger Interface."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.delegation.ILogger"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Implementations">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StreamLogger Class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.delegation.StreamLogger"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the StreamLogger class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.delegation.StreamLogger"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the StreamLogger JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.delegation.StreamLoggerTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the FilteringLogger Class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.delegation.FilteringLogger"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the FilteringLogger class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.delegation.FilteringLogger"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the FilteringLogger JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.delegation.FilteringLoggerTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the DistributingLogger Class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.delegation.DistributingLogger"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the DistributingLogger class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.delegation.DistributingLogger"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the DistributingLogger JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.delegation.DistributingLoggerTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code."/>
        <a xsi:type="workbench:DebugEventAnswer" elementId="patterns.delegation.*Logger" action="suspend.breakpoint"/>
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
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a"/>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490457311204" sizeMeasure="22">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.delegation;&#xA;&#xA;import java.io.OutputStream;&#xA;&#xA;public class StreamLogger implements ILogger{&#xA;&#x9;&#xA;&#x9;&#xA;&#x9;public StreamLogger(OutputStream stream){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public void log(String severity, String message, Exception exception) {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;ILogger logger = new StreamLogger(System.out);&#xA;&#x9;logger.log(ILogger.INFO, &quot;Denne meldingen er til informasjon og skrives til System.out&quot;, null);&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490459556787" sizeMeasure="39" warningCount="1">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="IOException;&#xA;import java.io.OutputStream;&#xA;&#xA;public class StreamLogger implements ILogger{&#xA;&#x9;String formatString = &quot;%s: %s (%s)&quot;;&#xA;&#x9;private OutputStream stream;&#xA;&#x9;&#xA;&#x9;public StreamLogger(OutputStream stream){&#xA;&#x9;&#x9;this.formatString=formatString;&#xA;&#x9;&#x9;this.stream=stream;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;public void setFormatString(String formatString){&#xA;&#x9;&#x9;this.formatString=formatString;&#xA;&#x9;}&#xA;&#x9;public String format(String formatString, String severity, String message, Exception exception){&#xA;&#x9;&#x9;String formatedMessage=String.format(formatString,severity,message,exception);&#xA;&#x9;&#x9;return formatedMessage;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public void log(String severity, String message, Exception exception) {&#xA;&#x9;&#x9;String logMessage = format(this.formatString,  severity, message, exception);&#xA;&#x9;&#x9;try {&#xA;&#x9;&#x9;&#x9;this.stream.write(logMessage.getBytes());&#xA;&#x9;&#x9;} catch (IOException e) {&#xA;&#x9;&#x9;&#x9;// TODO Auto-generated catch block&#xA;&#x9;&#x9;&#x9;e.printStackTrace();&#xA;&#x9;&#x9;}" edit="/1/@proposals.1/@proposals.0/@attempts.0/@edit" start="45" end="-200"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="11" charStart="259" charEnd="289" severity="1" problemCategory="90" problemType="536871090"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490459764712" sizeMeasure="40" warningCount="1">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.1/@proposals.0/@attempts.1/@edit" start="1114" end="-7"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="11" charStart="259" charEnd="289" severity="1" problemCategory="90" problemType="536871090"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490460032428" sizeMeasure="40" warningCount="1">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.1/@proposals.0/@attempts.2/@edit" start="1120" end="-1121"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="11" charStart="259" charEnd="289" severity="1" problemCategory="90" problemType="536871090"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490783841908" sizeMeasure="40" warningCount="1">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.1/@proposals.0/@attempts.3/@edit" start="1120" end="-1121"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="11" charStart="259" charEnd="289" severity="1" problemCategory="90" problemType="536871090"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490457312936" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490459556718" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490459574648" mode="run"/>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1490615264578" mode="run"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1490460067272" completion="1.0" successCount="3">
          <successTests>testLog</successTests>
          <successTests>testLogException</successTests>
          <successTests>testLogWithFormat</successTests>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490460138122" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.delegation;&#xA;&#xA;public class FilteringLogger {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490615264648" sizeMeasure="57" errorCount="3" warningCount="1">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="implements ILogger{&#xA;&#xA;&#x9;public String[] VALUES = new String[] {&quot;&quot;}; // er dette lurt?&#xA;&#x9;&#xA;&#x9;public FilteringLogger(ILogger logger, String...severities){&#xA;&#x9;&#x9;this.VALUES=severities;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;boolean setIsLogging(String severity, boolean value){&#xA;&#x9;&#x9;if(value){&#xA;&#x9;&#x9;&#x9;this.VALUES.add(severity); // hvordan adder jeg ?&#xA;&#x9;&#x9;}else{&#xA;&#x9;&#x9;&#x9;this.VALUES.remove(severity); // Hvordan fjerner jeg?&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;private boolean isLogging(String severity){&#xA;&#x9;&#x9;if(this.VALUES.contains(severity)){ // Sjekker om severity er i VALUES?&#xA;&#x9;&#x9;&#x9;return true;&#xA;&#x9;&#x9;}else{&#xA;&#x9;&#x9;&#x9;return false;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void log(String severity, String message, Exception exception) {&#xA;&#x9;&#x9;String logMessage=&quot;&quot;;&#xA;&#x9;&#x9;if(severity.equalsIgnoreCase(&quot;error&quot;)){&#xA;&#x9;&#x9;&#x9;logMessage+=&quot;Denne meldingen er alvorlig&quot;;&#xA;&#x9;&#x9;&#x9;if(this.isLogging(severity)){&#xA;&#x9;&#x9;&#x9;&#x9;logMessage+=&quot; og skrives til System.err&quot;;&#xA;&#x9;&#x9;&#x9;}else{&#xA;&#x9;&#x9;&#x9;&#x9;logMessage+=&quot; og blir filtrert bort&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else if(severity.equalsIgnoreCase(&quot;warning&quot;)){&#xA;&#x9;&#x9;&#x9;logMessage+=&quot;Denne meldingen er en advarsel&quot;;&#xA;&#x9;&#x9;&#x9;if(this.isLogging(severity)){&#xA;&#x9;&#x9;&#x9;&#x9;logMessage+=&quot; og skrives til System.err&quot;;&#xA;&#x9;&#x9;&#x9;}else{&#xA;&#x9;&#x9;&#x9;&#x9;logMessage+=&quot; og blir filtrert bort&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}else{&#xA;&#x9;&#x9;&#x9;logMessage+=&quot;Denne meldingen er til informasjon&quot;;&#xA;&#x9;&#x9;&#x9;if(this.isLogging(severity)){&#xA;&#x9;&#x9;&#x9;&#x9;logMessage+=&quot; og skrives til System.err&quot;;&#xA;&#x9;&#x9;&#x9;}else{&#xA;&#x9;&#x9;&#x9;&#x9;logMessage+=&quot; og blir filtrert bort&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;" edit="/1/@proposals.1/@proposals.3/@attempts.0/@edit" start="59" end="-5"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="14" charStart="326" charEnd="351" severity="2" problemCategory="50" problemType="67108980"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="16" charStart="390" charEnd="418" severity="2" problemCategory="50" problemType="67108980"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="20" charStart="505" charEnd="535" severity="2" problemCategory="50" problemType="67108980"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="29" charStart="727" charEnd="737" severity="1" problemCategory="120" problemType="536870973"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1490647749501" sizeMeasure="59" errorCount="1" warningCount="1">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="import java.util.ArrayList;&#xA;&#xA;public class FilteringLogger implements ILogger{&#xA;&#xA;&#x9;ArrayList&lt;String> VALUES = new ArrayList&lt;String>();&#xA;&#x9;&#xA;&#x9;public FilteringLogger(ILogger logger, String...severities){&#xA;&#x9;&#x9;this.VALUES=severities;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;void" edit="/1/@proposals.1/@proposals.3/@attempts.1/@edit" start="30" end="-1139"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="10" charStart="249" charEnd="259" severity="2" problemCategory="40" problemType="16777233"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="31" charStart="745" charEnd="755" severity="1" problemCategory="120" problemType="536870973"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.4/@q" answer="/0/@parts.1/@tasks.4/@a"/>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.1/@tasks.5/@q" answer="/0/@parts.1/@tasks.5/@a"/>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.1/@tasks.6/@q" answer="/0/@parts.1/@tasks.6/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.7/@q" answer="/0/@parts.1/@tasks.7/@a"/>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.1/@tasks.8/@q" answer="/0/@parts.1/@tasks.8/@a"/>
    </proposals>
    <proposals exercisePart="/0/@parts.2">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.2/@tasks.0/@q" answer="/0/@parts.2/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.2/@tasks.1/@q" answer="/0/@parts.2/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.2/@tasks.2/@q" answer="/0/@parts.2/@tasks.2/@a"/>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.2/@tasks.3/@q" answer="/0/@parts.2/@tasks.3/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
