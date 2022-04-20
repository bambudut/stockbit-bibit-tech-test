export const storeResponse = {
    type: "object",
    properties: {
        id: {
            type: "number",
        },
        petId: {
            type: "number",
        },
        quantity: {
            type: "number",
        },
        shipDate: {
            type: "string",
        },
        status: {
            type: "string",
        },
        complete: {
            type: "boolean",
        },
    },
    required: ["id", "petId", "status"],
};

export const generalResponse = {
    type: "object",
    properties: {
        code: {
            type: "number",
        },
        type: {
            type: "string",
        },
        message: {
            type: "string",
        },
    },
    required: ["code"],
};