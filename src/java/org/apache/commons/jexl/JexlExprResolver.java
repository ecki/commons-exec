/*
 * Copyright 2002,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.jexl;

/**
 *  A Resolver allows custom resolution of the expression, and can be
 *  added in front of the jexl engine, or after in the evaluation
 *
 *  @todo This needs to be explained in detail.  Why do this?
 *  @since 1.0
 *  @author <a href="mailto:geirm@adeptra.com">Geir Magnusson Jr.</a>
 *  @version $Id$
 */
public interface JexlExprResolver
{
    Object NO_VALUE = new Object();

    /**
     *  evaluates an expression against the context
     *
     *  @todo Must detail the expectations and effects of this resolver.
     *  @param context current data context
     *  @param expression expression to evauluate
     *  @return value (may be null) po the NO_VALUE object to
     *       indicate no resolution.
     */
    Object evaluate(JexlContext context, String expression);
}