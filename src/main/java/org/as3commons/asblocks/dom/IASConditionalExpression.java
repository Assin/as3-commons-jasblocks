////////////////////////////////////////////////////////////////////////////////
// Copyright 2011 Michael Schmalle - Teoti Graphix, LLC
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
// http://www.apache.org/licenses/LICENSE-2.0 
// 
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and 
// limitations under the License
// 
// Author: Michael Schmalle, Principal Architect
// mschmalle at teotigraphix dot com
////////////////////////////////////////////////////////////////////////////////

package org.as3commons.asblocks.dom;

/**
 * Conditional expression (ternary operator); <code>condition ? then : else</code>.
 * 
 * <pre>
 * IASExpression condition = factory.newExpression("foo");
 * IASExpression thenExp = factory.newExpression("bar");
 * IASExpression elseExp = factory.newExpression("baz");
 * IASConditionalExpression ce = factory.newConditionalExpression(condition, thenExp, elseExp);
 * </pre>
 * 
 * <p>Will produce; <code>foo ? bar : baz</code>.</p>
 * 
 * <pre>
 * IASExpression condition = factory.newExpression("foo");
 * IASExpression thenExp = factory.newExpression("bar");
 * IASExpression elseExp = factory.newExpression("baz");
 * IASConditionalExpression ce = factory.newConditionalExpression(condition, thenExp, elseExp);
 * ce.setCondition(factory.newExpression("foo < 42"));
 * ce.setThenExpression(factory.newExpression("foBar()"));
 * ce.setElseExpression(factory.newExpression("foBaz()"));
 * </pre>
 * 
 * <p>Will produce; <code>foo < 42 ? foBar() : foBaz()</code>.</p>
 * 
 * <pre>
 * IASConditionalExpression ce = (IASConditionalExpression) factory.newExpression("foo ? bar : baz");
 * </pre>
 * 
 * <p>Will produce an <code>IASConditionalExpression</code>.</p>
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.ASFactory#newConditionalExpression(IASExpression, IASExpression, IASExpression)
 */
public interface IASConditionalExpression extends IASExpression
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------
	
	//----------------------------------
	//  condition
	//----------------------------------
	
	/**
	 * The condition expression that resolves to the <code>thenExpression</code> 
	 * or <code>elseExpression</code>.
	 */
	public IASExpression getCondition();
	
	/**
	 * @see #getCondition()
	 */
	public void setCondition(IASExpression value);
	
	//----------------------------------
	//  thenExpression
	//----------------------------------
	
	/**
	 * The expression that is executed when the <code>condition</code> is 
	 * <code>true</code>.
	 */
	public IASExpression getThenExpression();
	
	/**
	 * @see #getThenExpression()
	 */
	public void setThenExpression(IASExpression value);
	
	//----------------------------------
	//  elseExpression
	//----------------------------------
	
	/**
	 * The expression that is executed when the <code>condition</code> is 
	 * <code>false</code>.
	 */
	public IASExpression getElseExpression();
	
	/**
	 * @see #getElseExpression()
	 */
	public void setElseExpression(IASExpression value);
}
