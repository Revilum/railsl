/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.railsl.compilation;

import de.cau.cs.kieler.kicool.compilation.ProcessorType;
import de.cau.cs.kieler.railsl.railSL.RailProgram;
import de.cau.cs.kieler.kicool.compilation.CodeContainer;
import de.cau.cs.kieler.kicool.compilation.Processor;

/**
 * 
 */
public class RailSLToJSON extends Processor<RailProgram, CodeContainer> {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return "de.cau.cs.kieler.railsl.json";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "RailSL to JSON";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void process() {
        // TODO Auto-generated method stub
        
    }

}
