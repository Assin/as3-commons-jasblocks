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
 * A break statement with optional label; <code>break;</code> or 
 * <code>break myLoop;</code>.
 * 
 * <pre>
 * IASBlock block = factory.newBlock();
 * IASBreakStatement bs = block.newBreak();
 * </pre>
 * 
 * <p>Will produce;</p>
 * <pre>
 * {
 *     break;
 * }
 * </pre>
 * 
 * <pre>
 * IASBlock block = factory.newBlock();
 * IASBreakStatement bs = block.newBreak("myLoop");
 * </pre>
 * 
 * <p>Will produce;</p>
 * <pre>
 * {
 *     break myLoop;
 * }
 * </pre>
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IStatementContainer#newBreak()
 * @see org.as3commons.asblocks.dom.IStatementContainer#newBreak(String)
 */
public interface IASBreakStatement extends IASStatement
{
	//--------------------------------------------------------------------------
	//
	//  Public :: Properties
	//
	//--------------------------------------------------------------------------
	
	//----------------------------------
	//  label
	//----------------------------------
	
	/**
	 * The break's label identifier.
	 */
	public IASExpression getLabel();
	
	/**
	 * @see #getLabel()
	 */
	public void setLabel(IASExpression value);
	
	/**
	 * Returns the <code>String</code> break label.
	 * 
	 * @return A <code>String</code> label.
	 */
	public String getLabelString();
}
