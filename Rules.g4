grammar Rules;



/* --------------------- PARSER ELEMENTS -------------------- */



main : (command ';' | NEWLINE) * EOF ;

//falta: gradient, autodimensoes grelhas escalar com scale/rotate
//join:

command : draw |
	     setvar |
	     transform ;
	     
transform : rotate |
			scale |
			hyperlink |
			addpt |
			addcurve |
			addq |
			setClip |
			move |
			close ;
	     
setvar : a=ID '=' x=ID ('+' ID)* |
		 a=ID '=' ar=GroupString '(' ( ID (',' ID)* )* ')' |
		 a=ID '=' s=shape | 
		 a=ID '+=' d=ID ('+' ID)* | //group operation
		 a=ID '-=' r=ID ('-' ID)* | //group operation
		 a=ID '=' g=ClipString '(' ( ID (',' ID)* )* ')' |
		 ;
		 
	   
addpt : AddPtString '(' a=ID ',' x=INT ',' y=INT ')' |
	    AddPtString '(' a=ID ',' a1=attr ',' a2=attr ')' ;
	    
addcurve : AddCurveString '(' a=ID ',' a1=attr ',' a2=attr ',' a3=attr ',' a4=attr (',' a5=attr ',' a6=attr)? ')' ;

addq : AddQuadrString '(' a=ID ',' a1=attr ',' a2=attr ',' a3=attr ',' a4=attr ')' ;

close : CloseString '(' a=ID ')' ;
         
draw : DrawString s=shape |
	   DrawString a=ID ;

scale : ScaleString '(' a=ID ',' i=INT ')' |
	    ScaleString '(' a=ID ',' a1=attr ',' a2=attr ')' ;

rotate : RotateString '(' a=ID ',' i=INT ')' |
	     RotateString '(' a=ID ',' a1=attr (',' a2=attr ',' a3=attr)? ')' ; //rotate(var,degrees,x,y)
	     
setClip : SetClipString '(' a=ID ',' i=ID ')' ; //setClip(clipPath,target)	     
	   
move : MoveString '(' a=ID ',' a1=attr (',' a2=attr)? ')' ;
	   
hyperlink : LinkString '(' a=ID ',' t=TEXT ')' ;

shape : circle | 
		rect |
		sq |
		ellipse |
		line |
		polyline |
		star |
		polygon |
		comment |
		regular |
		path
		;   
		
comment : CmtString '(' TEXT (',' TEXT)* ',' a1=attr ',' a2=attr (',' a3=attr)? (',' a4=attr)? (',' a5=attr)? ')' ; //text text ... x y color? stroke? swidth?
	 
circle : CircleString '(' a1=attr ',' a2=attr ',' a3=attr (',' a4=attr)? (',' a5=attr)? (',' a6=attr)? ')' ; //x y r color? stroke? swidth?
		 
rect : RectString '(' a1=attr ',' a2=attr ',' a3=attr ',' a4=attr (',' a5=attr)? (',' a6=attr)? (',' a7=attr)? ')' ; //x y h w color? stroke? swidth?
	   
sq : SqString '(' a1=attr ',' a2=attr ',' a3=attr (',' a4=attr)? (',' a5=attr)? (',' a6=attr)? ')' ; //x y h/w color? stroke? swidth?
	
ellipse : ElString '(' a1=attr ',' a2=attr ',' a3=attr ',' a4=attr (',' a5=attr)? (',' a6=attr)? (',' a7=attr)? ')' ; //x y h w color? stroke? swidth?
	      
line : LineString '(' '(' i1=INT ',' i2=INT ')' '(' i3=INT ',' i4=INT ')' (',' a5=attr)? (',' a6=attr)? ')' ;//x,y,x,y implicitos color? sw?
	   
//array para guardar todos os nums
//verificar se tem 4+ nums
polyline : PolyString '(' '(' INT ',' INT ')' ('(' INT ',' INT ')')+ (',' a1=attr)? (',' a2=attr)? (',' a3=attr)? ')' ;//x,y,x,y implicitos color? s? sw?
	      
star : StarString '(' a1=attr ',' a2=attr ',' a3=attr ',' a4=attr ',' a5=attr (',' a6=attr)? (',' a7=attr)? (',' a8=attr)? ')' ; //x y r inner n color?

polygon : PolygonString '(' '(' INT ',' INT ')' ('(' INT ',' INT ')')+ (',' a1=attr)? (',' a2=attr)? (',' a3=attr)? ')' ;//x,y,x,y implicitos color? s? sw?

regular : RegString '(' a1=attr ',' a2=attr ',' a3=attr ',' a4=attr (',' a5=attr)? (',' a6=attr)? (',' a7=attr)? ')' ; //x y n r color? s? sw?

path : PathString '(' x=INT ',' y=INT (',' a1=attr)? (',' a2=attr)? (',' a3=attr)? ')' ; //starting x y color? s? sw?

//elementos basicos
	 
attr: 
	   id='r' '=' value=INT |
	   id='radius' '=' value=INT |
	   id='w' '=' value=INT  |
	   id='width' '=' value=INT |
	   id='h' '=' value=INT |
	   id='height' '=' value=INT |
	   id='c' '=' value=TEXT |
	   id='color' '=' value=TEXT |
	   id='x' '=' value=INT |
	   id='y' '=' value=INT |
	   id='t' '=' value=TEXT |
	   id='text' '=' value=TEXT |
	   id='s' '=' value=TEXT |
	   id='stroke' '=' value=TEXT |
	   id='sw' '=' value=INT |
	   id='stroke-width' '=' value=INT |
	   id='a' '=' value=INT |
	   id='angle' '=' value=INT |
	   id='inner' '=' value=INT |
	   id='innerRadius' '=' value=INT |
	   id='n' '=' value=INT |
	   id='nTips' '=' value=INT |
	   id='nSides' '=' value=INT |
	   id='bx' '=' value=INT |
	   id='by' '=' value=INT |
	   id='bx2' '=' value=INT |
	   id='by2' '=' value=INT |
	   ;



/* --------------------- LEXER ELEMENTS -------------------- */   

SqString : 'sq' | 'square' ;
RectString : 'rect' | 'rectangle' ;
CircleString : 'circ' | 'circle' ;
ElString : 'el' | 'ellipse' ;
LineString : 'line' ;		 
PolyString : 'pline' | 'polyline' ;	
StarString : 'star' ;	
PolygonString : 'pgon' | 'polygon' ;
TextString : 'text' ;
DrawString : 'draw' ;
RotateString : 'rotate' ;
ScaleString : 'scale' ;
CmtString : 'cmt' | 'comment' ;
LinkString : 'link' ;
RegString : 'reg' | 'regular' ;
AddPtString : 'add' | 'addpt' | 'addPoint' ;
AddCurveString : 'addc' | 'addCurve' ;
AddQuadrString : 'addq' | 'addQuadratic' ;
CloseString : 'close' ;
GroupString : 'group' ;
ClipString : 'clipPath' | 'clip' ;
PathString : 'path' ;
MoveString : 'move';
SetClipString : 'setClip' ;

TEXT : '"'[a-zA-Z0-9 .]+'"' ; // 'text'

ID : [a-zA-Z][a-zA-Z0-9]* ;      

INT : [0-9]+ ;

NEWLINE: '\r'? '\n';

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlinesss

