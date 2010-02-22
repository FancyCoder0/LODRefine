package com.metaweb.gridworks.commands.recon;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.metaweb.gridworks.commands.EngineDependentCommand;
import com.metaweb.gridworks.model.AbstractOperation;
import com.metaweb.gridworks.model.operations.ReconMatchBestCandidatesOperation;

public class ReconMatchBestCandidatesCommand extends EngineDependentCommand {
	
	@Override
	protected AbstractOperation createOperation(HttpServletRequest request,
			JSONObject engineConfig) throws Exception {
		
		String columnName = request.getParameter("columnName");
		
		return new ReconMatchBestCandidatesOperation(engineConfig, columnName);
	}
}