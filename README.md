# GETTW (Graphical Editor To The Web) Diagrammer

**GETTW** is a **Model-Driven Development (MDD)** tool designed to automatically generate **collaborative, cross-platform, and multitouch graphical editors** tailored for engineering education.

Built on the **Eclipse Epsilon** framework and the **Graphical Modelling Framework (GMF)**, GETTW allows professors to visually design a diagram editor using a drag-and-drop interface and rapidly generate a lightweight web application based on **GoJS** (visualization) and **TogetherJS** (collaboration).

## Quick Start

To begin using GETTW, you must set up the Eclipse Modeling environment to access the generator plugin.

### Prerequisites

* **Eclipse IDE** with:
  * Eclipse Epsilon (https://eclipse.dev/epsilon/download/)
  * Emfatic (https://eclipse.dev/emfatic/download/)
* **Java Development Kit (JDK)**

### Core Workflow

| Step | Action | Purpose |
| :--- | :--- | :--- |
| **1. Design Editor** | Open the GETTW Eclipse Plugin and design the diagram using the Palette. | Allows the professor to visually select nodes (Shapes, Pictures) and links specific to the domain (e.g., Use Cases, FIR filters). |
| **2. Configure** | Set properties for each element (Color, Size, Stroke, Text) via the Properties view. | Customizes the visual appearance and constraints of the final editor. |
| **3. Validate** | When creating/editing a GETTW model, click 'Edit/Validate'. | Ensures the model adheres to all defined constraints in the EVL file before generation. |
| **4. Generate** | Run the **EGL** transformation script. | Automatically transforms the Eclipse model into HTML, CSS, and JavaScript code into the GETTW_Base directory. |
| **5. Collaborate** | Deploy the generated files. | The output connects to a Glitch/TogetherJS server to enable real-time collaboration across devices. |

## Key Technologies

GETTW relies on the **Epsilon** family of languages for model management and modern web libraries for the runtime environment.

| Category | Technology | Function |
| :--- | :--- | :--- |
| **Modeling Foundation** | Eclipse EMF & GMF | Provides the core framework for defining the editor's meta-model and the visual drag-and-drop design interface. |
| **Metamodelling** | Emfatic language | Used to declaratively define the abstract syntax (entities like *Shape, Link, Picture*) of the GETTW system. |
| **Code Generation** | EGL (Epsilon Generation Language) | Template language used for Model-to-Text (M2T) transformations, converting the design model into web code (HTML/JS). |
| **Visualization** | GoJS | A powerful JavaScript library used in the generated output to render interactive diagrams and multitouch gestures. |
| **Collaboration** | TogetherJS and Glitch | Provides the real-time synchronization layer, allowing multiple users to edit diagrams simultaneously via HTTP requests. |

## Directory Organization

The repository is organized to separate the MDD logic (meta-models, templates) from the generated runtime application:

```text
GETTW/
├── gettw/model/             # Meta-model Definitions
│   ├──gettw.emf             # Emfatic source defining the abstract syntax (Nodes, Links)
│   └── gettw.ecore          # The generated EMF Metamodel file
│
├── diagram/                 # Main Eclipse Graphical Editor Plugin
│   ├── src/                 # Java source code for the GMF editor logic
│   └── plugin.xml           # Eclipse plugin configuration
│
├── GETTW_Base/template      # Code Generation Templates
│   ├── gettw_main.egx       # Entry point for the transformation
│   └── gettw_template.egl   # Generates the index.html and GoJS nodes/links structure and configuration
│
└── GETTW_Base/              # OUTPUT DIRECTORY: Generated web application
    ├── index.html           # The main entry point for the editor
    ├── css/                 # Stylesheets for responsive/multitouch layout
    └── js/
        └── gettw.js         # GoJS template for generated JavaScript configuration

