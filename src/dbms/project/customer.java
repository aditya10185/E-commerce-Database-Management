/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms.project;

/**
 *
 * @author Vaibhavi
 */
public   class customer {
    
static int custId;

public customer(int id)
{
    this.custId=id;
}
int getid()
{
    return custId;
}
void setNull()
{
  custId=0;  
}

}
