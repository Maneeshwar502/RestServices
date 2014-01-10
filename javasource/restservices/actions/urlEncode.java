// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.util.Utils;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * applies URL encoding to a value
 */
public class urlEncode extends UserAction<String>
{
	private String value;

	public urlEncode(String value)
	{
		super();
		this.value = value;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Utils.urlEncode(value);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "urlEncode";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
