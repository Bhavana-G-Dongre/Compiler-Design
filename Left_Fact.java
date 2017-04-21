

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Left_Fact
 */
@WebServlet("/Left_Fact")
public class Left_Fact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Left_Fact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				Scanner in=new Scanner(System.in);
				String gram1, gram="",gram2="",part1="",part2="",p1,p2,m,modifiedGram="",newGram="",n,tempGram="",t;
				int i,j=0,k=0,l=0,pos=0;
				PrintWriter out=response.getWriter();
				response.setContentType("text/html");
				gram1=request.getParameter("g");
				switch(gram1)
				{
				case "Grammar1":
					gram="ert|erd";
					gram2="A-->ert|erd";
					break;
				case "Grammar2":
					gram="frw|fra";
					gram2="A-->frw|fra";
					break;
				case "Grammar3":
					gram="DRe|DRw";
					gram2="A-->DRe|DRw";
					break;
				case "Grammar4":
					gram="Gsd|Gta";
					gram2="A-->Gsd|Gta";
					break;
				case "Grammar5":
					gram="bRs|bqa";
					gram2="A-->bRs|bqa";
					break;
				}
				for(i=0;gram.charAt(i)!='|';i++,j++){  
					p1=String.valueOf(gram.charAt(i));
					part1=part1+p1;
				}
				//part1[j]="\0";  
				for(j=++i,i=0;j<gram.length();j++,i++)  
				{
					//System.out.println(gram.length());
					p2=String.valueOf(gram.charAt(j));
					part2=part2+p2;
					//System.out.println(part2);
					if(j==gram.length()-1)
						break;
						
				}
				for(i=0;i<part1.length()||i<part2.length();i++)  
				       {  
					//System.out.println(part1.length());
				            if(part1.charAt(i)==part2.charAt(i))  
				            {  
				            	m=String.valueOf(part1.charAt(i));
				                 modifiedGram+=m;  
				                 k++;  
				                 pos=i+1;  
				            }  
				       }  
				//System.out.println(part1);
				       for(i=pos,j=0;i<part1.length();i++,j++){ 
				    	   //System.out.println(part1.charAt(i));
				           n=String.valueOf(part1.charAt(i));
				    	   newGram+=n;  
				          
				       //System.out.println(newGram[j]);
				       }  
				       newGram+="|";
				       //newGram[j++]="|";  
				       for(i=pos;i<part2.length();i++,j++){
				    	   n=String.valueOf(part2.charAt(i));
				    	   newGram+=n;
				            //newGram[j]=part2[i];  
				       }  
				       //modifiedGram[k]="X";  
				       //modifiedGram[++k]="\0";
				       modifiedGram+="X";
				       //newGram[j]="\0";
				       out.println("The Grammar you selected is :");
				       out.println("<html><br><br></html>"+gram2);
				       out.println("<html><br><br></html>"+"On left factoring : ");
				       out.println("<html><br><br></html>");
				    	   out.println("A-->"+modifiedGram+"  ,  ");
				    	   out.println("X-->"+newGram); 
				}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
