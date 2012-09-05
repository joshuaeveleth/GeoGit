/* Copyright (c) 2011 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the LGPL 2.1 license, available at the root
 * application directory.
 */

package org.geogit.cli.porcelain;

import org.geogit.cli.AbstractCommand;
import org.geogit.cli.CLICommand;
import org.geogit.cli.GeogitCLI;

import com.beust.jcommander.Parameters;

/**
 *
 */
@Parameters(commandNames = "branch", commandDescription = "List, create, or delete branches")
public class Branch extends AbstractCommand implements CLICommand {

    @Override
    public void runInternal(GeogitCLI cli) {
        // TODO Auto-generated method stub

    }

}